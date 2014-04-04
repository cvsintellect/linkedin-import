package com.cvsintellect.linkedinimport.oauth;

import com.cvsintellect.linkedinimport.model.main.ConnectionInfo;
import com.cvsintellect.linkedinimport.model.main.JobSearchInfo;
import com.cvsintellect.linkedinimport.model.main.PersonProfile;
import com.cvsintellect.linkedinimport.parser.HRXMLParser;
import org.apache.commons.io.IOUtils;
import org.brickred.socialauth.util.ProviderSupport;
import org.brickred.socialauth.util.Response;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

public class LinkedInPluginImpl implements CVsIntellectLinkedInPlugin {
	private ProviderSupport providerSupport;

	private static final String PROFILE_API_PARAMETERS = "first-name,last-name,maiden-name,headline,location:(name,country:(code)),industry,num-connections,summary,specialties,"
			+ "picture-url,public-profile-url,email-address,site-standard-profile-request:(url),api-standard-profile-request:(url,headers),"
			+ "last-modified-timestamp,associations,honors,interests,num-recommenders,date-of-birth,member-url-resources:(url,name),"
			+ "phone-numbers,im-accounts,main-address,twitter-accounts,"
			+ "positions:(id,title,summary,start-date,end-date,is-current,company:(id,name,type,size,industry,ticker)),"
			+ "publications:(id,title,publisher:(name),authors:(id,name,person),date,url,summary),"
			+ "patents:(id,title,summary,number,status:(id,name),office:(name),inventors:(id,name,person),date,url),"
			+ "languages:(id,language:(name),proficiency:(level,name)),"
			+ "skills:(id,skill:(name),proficiency:(level,name),years:(id,name)),"
			+ "certifications:(id,name,authority:(name),number,start-date,end-date),"
			+ "educations:(id,school-name,field-of-study,start-date,end-date,degree,activities,notes),"
			+ "courses:(id,name,number),"
			+ "volunteer:(volunteer-experiences:(id,role,organization:(name),cause:(name))),"
			+ "recommendations-received:(id,recommendation-type,recommendation-text,recommender)";

	private static final String PROFILE_URL = "http://api.linkedin.com/v1/people/~:(id," + PROFILE_API_PARAMETERS + ")";

	private static final String CONNECTION_API_PARAMETERS = "first-name,last-name,maiden-name,headline,location:(name,country:(code)),industry,num-connections,summary,specialties,"
			+ "picture-url,public-profile-url,site-standard-profile-request:(url),api-standard-profile-request:(url,headers),honors-awards,date-of-birth,member-url-resources:(url,name),"
			+ "positions:(id,title,summary,start-date,end-date,is-current,company:(id,name,type,size,industry,ticker))";

	private static final String CONNECTION_URL = "http://api.linkedin.com/v1/people/~/connections:(id," + CONNECTION_API_PARAMETERS + ")";

	public static final String JOB_API_PARAMETERS = "(jobs:(id,customer-job-code,active,posting-date,expiration-date,"
			+ "company:(id,name),position:(title,location,job-functions,industries,job-type,experience-level),skills-and-experience,description,salary,"
			+ "job-poster:(id,first-name,last-name,headline),referral-bonus,site-job-url,location-description))";

	private static final String JOB_URL = "http://api.linkedin.com/v1/job-search:" + JOB_API_PARAMETERS + "?";

	public LinkedInPluginImpl(ProviderSupport providerSupport) {
		this.providerSupport = providerSupport;
	}

	@Override
	public ProviderSupport getProviderSupport() {
		return providerSupport;
	}

	@Override
	public void setProviderSupport(ProviderSupport providerSupport) {
		this.providerSupport = providerSupport;
	}

	@Override
	public PersonProfile getProfile() throws Exception {
		String personProfileResponse = getResponseFor(PROFILE_URL);

		PersonProfile personProfile = null;
		try {
			personProfile = HRXMLParser.parsePersonInformation(personProfileResponse);
		} catch (Exception e) {
			throw new RuntimeException("Failed to parse the profile from response." + PROFILE_URL, e);
		}

		return personProfile;
	}

	@Override
	public List<PersonProfile> getContactList() throws Exception {
		String contactsResponse = getResponseFor(CONNECTION_URL);

		List<PersonProfile> contactList = null;
		try {
			ConnectionInfo connectionInfo = HRXMLParser.parseConnectionsInformation(contactsResponse);
			if (connectionInfo.getConnections() != null && !connectionInfo.getConnections().isEmpty()) {
				contactList = new ArrayList<PersonProfile>();
				for (PersonProfile contact : connectionInfo.getConnections()) {
					contactList.add(contact);
				}
			}
		} catch (Exception e) {
			throw new RuntimeException("Failed to parse connections from response." + CONNECTION_URL, e);
		}

		return contactList;
	}

	@Override
	public JobSearchInfo getJobs(String companyName, String countryCode) {
		String jobsQueryURL = JOB_URL + "company-name=" + companyName + "&country-code=" + countryCode;
		String jobSearchResponse = getResponseFor(jobsQueryURL);

		JobSearchInfo jobSearchInfo = null;
		try {
			jobSearchInfo = HRXMLParser.parseJobSearchInformation(jobSearchResponse);
		} catch (Exception e) {
			throw new RuntimeException("Failed to parse job search info from response." + jobsQueryURL, e);
		}

		return jobSearchInfo;
	}

	private String getResponseFor(String url) {
		Response serviceResponse = null;
		try {
			serviceResponse = providerSupport.api(url);
		} catch (Exception e) {
			throw new RuntimeException("Failed to retrieve from: " + url, e);
		}

		if (serviceResponse.getStatus() != 200) {
			throw new RuntimeException("Failed to retrieve from: " + url + ". Status :" + serviceResponse.getStatus());
		}

		try {
			StringWriter writer = new StringWriter();
			IOUtils.copy(serviceResponse.getInputStream(), writer, "UTF-8");
			return writer.toString();
		} catch (Exception e) {
			throw new RuntimeException("Failed to read response." + url, e);
		}
	}
}
