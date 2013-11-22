package com.cvsintellect.linkedinimport.model.main;

import java.io.Serializable;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import com.cvsintellect.linkedinimport.model.certification.CertificationInfo;
import com.cvsintellect.linkedinimport.model.contact.ContactNumberInfo;
import com.cvsintellect.linkedinimport.model.contact.IMAccountInfo;
import com.cvsintellect.linkedinimport.model.contact.Location;
import com.cvsintellect.linkedinimport.model.courses.CourseSetInfo;
import com.cvsintellect.linkedinimport.model.education.EducationInfo;
import com.cvsintellect.linkedinimport.model.language.LanguageSetInfo;
import com.cvsintellect.linkedinimport.model.patent.PatentInfo;
import com.cvsintellect.linkedinimport.model.position.PositionInfo;
import com.cvsintellect.linkedinimport.model.publication.PublicationInfo;
import com.cvsintellect.linkedinimport.model.recommendation.RecommendationInfo;
import com.cvsintellect.linkedinimport.model.skills.SkillSetInfo;
import com.cvsintellect.linkedinimport.model.twitter.TwitterAccountInfo;
import com.cvsintellect.linkedinimport.model.urls.URLResource;
import com.cvsintellect.linkedinimport.model.util.LinkedInDate;
import com.cvsintellect.linkedinimport.model.util.MemberURLResourceInfo;
import com.cvsintellect.linkedinimport.model.volunteer.VoluteerInfo;

@Root
public class PersonProfile implements Serializable {
	private static final long serialVersionUID = 1L;

	@Element(name = "id")
	private String linkedinId;

	@Element(name = "first-name", required = false)
	private String firstName;

	@Element(name = "last-name", required = false)
	private String lastName;

	@Element(name = "maiden-name", required = false)
	private String maidenName;

	@Element(required = false)
	private String headline;

	@Element(required = false)
	private Location location;

	@Element(required = false)
	private String industry;

	@Element(name = "num-connections", required = false)
	private int numOfConnections;

	@Element(required = false)
	private String summary;

	@Element(required = false)
	private String specialties;

	@Element(name = "picture-url", required = false)
	private String pictureURL;

	@Element(name = "public-profile-url", required = false)
	private String publicProfileURL;

	@Element(name = "email-address", required = false)
	private String emailAddress;

	@Element(name = "site-standard-profile-request", required = false)
	private URLResource siteStandardProfileRequest;

	@Element(name = "api-standard-profile-request", required = false)
	private URLResource apiStandardProfileRequest;

	@Element(name = "last-modified-timestamp", required = false)
	private long lastModifiedTimestamp;

	@Element(name = "associations", required = false)
	private String groups;

	@Element(required = false)
	private String honors;

	@Element(name = "interests", required = false)
	private String hobbies;

	@Element(name = "num-recommenders", required = false)
	private int numRecommenders;

	@Element(name = "date-of-birth", required = false)
	private LinkedInDate dateOfBirth;

	@Element(name = "member-url-resources", required = false)
	private MemberURLResourceInfo memberURLResources;

	@Element(name = "phone-numbers", required = false)
	private ContactNumberInfo contactNumbers;

	@Element(name = "im-accounts", required = false)
	private IMAccountInfo imAccounts;

	@Element(name = "main-address", required = false)
	private String mainAddress;

	@Element(name = "twitter-accounts", required = false)
	private TwitterAccountInfo twitterAccounts;

	@Element(required = false)
	private PositionInfo positions;

	@Element(required = false)
	private PublicationInfo publications;

	@Element(required = false)
	private PatentInfo patents;

	@Element(required = false)
	private LanguageSetInfo languages;

	@Element(required = false)
	private SkillSetInfo skills;

	@Element(required = false)
	private CertificationInfo certifications;

	@Element(required = false)
	private EducationInfo educations;

	@Element(required = false)
	private CourseSetInfo courses;

	@Element(name = "volunteer", required = false)
	private VoluteerInfo volunteers;

	@Element(name = "recommendations-received", required = false)
	private RecommendationInfo recommendations;

	public PersonProfile() {
		super();
	}

	public String getLinkedinId() {
		return linkedinId;
	}

	public void setLinkedinId(String linkedinId) {
		this.linkedinId = linkedinId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMaidenName() {
		return maidenName;
	}

	public void setMaidenName(String maidenName) {
		this.maidenName = maidenName;
	}

	public String getHeadline() {
		return headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public int getNumOfConnections() {
		return numOfConnections;
	}

	public void setNumOfConnections(int numOfConnections) {
		this.numOfConnections = numOfConnections;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getSpecialties() {
		return specialties;
	}

	public void setSpecialties(String specialties) {
		this.specialties = specialties;
	}

	public String getPictureURL() {
		return pictureURL;
	}

	public void setPictureURL(String pictureURL) {
		this.pictureURL = pictureURL;
	}

	public String getPublicProfileURL() {
		return publicProfileURL;
	}

	public void setPublicProfileURL(String publicProfileURL) {
		this.publicProfileURL = publicProfileURL;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public URLResource getSiteStandardProfileRequest() {
		return siteStandardProfileRequest;
	}

	public void setSiteStandardProfileRequest(URLResource siteStandardProfileRequest) {
		this.siteStandardProfileRequest = siteStandardProfileRequest;
	}

	public URLResource getApiStandardProfileRequest() {
		return apiStandardProfileRequest;
	}

	public void setApiStandardProfileRequest(URLResource apiStandardProfileRequest) {
		this.apiStandardProfileRequest = apiStandardProfileRequest;
	}

	public long getLastModifiedTimestamp() {
		return lastModifiedTimestamp;
	}

	public void setLastModifiedTimestamp(long lastModifiedTimestamp) {
		this.lastModifiedTimestamp = lastModifiedTimestamp;
	}

	public String getGroups() {
		return groups;
	}

	public void setGroups(String groups) {
		this.groups = groups;
	}

	public String getHonors() {
		return honors;
	}

	public void setHonors(String honors) {
		this.honors = honors;
	}

	public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	public int getNumRecommenders() {
		return numRecommenders;
	}

	public void setNumRecommenders(int numRecommenders) {
		this.numRecommenders = numRecommenders;
	}

	public LinkedInDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LinkedInDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public MemberURLResourceInfo getMemberURLResources() {
		return memberURLResources;
	}

	public void setMemberURLResources(MemberURLResourceInfo memberURLResources) {
		this.memberURLResources = memberURLResources;
	}

	public ContactNumberInfo getContactNumbers() {
		return contactNumbers;
	}

	public void setContactNumbers(ContactNumberInfo contactNumbers) {
		this.contactNumbers = contactNumbers;
	}

	public IMAccountInfo getIMAccounts() {
		return imAccounts;
	}

	public void setIMAccounts(IMAccountInfo imAccounts) {
		this.imAccounts = imAccounts;
	}

	public String getMainAddress() {
		return mainAddress;
	}

	public void setMainAddress(String mainAddress) {
		this.mainAddress = mainAddress;
	}

	public TwitterAccountInfo getTwitterAccounts() {
		return twitterAccounts;
	}

	public void setTwitterAccounts(TwitterAccountInfo twitterAccounts) {
		this.twitterAccounts = twitterAccounts;
	}

	public PositionInfo getPositions() {
		return positions;
	}

	public void setPositions(PositionInfo positions) {
		this.positions = positions;
	}

	public PublicationInfo getPublications() {
		return publications;
	}

	public void setPublications(PublicationInfo publications) {
		this.publications = publications;
	}

	public PatentInfo getPatents() {
		return patents;
	}

	public void setPatents(PatentInfo patents) {
		this.patents = patents;
	}

	public LanguageSetInfo getLanguages() {
		return languages;
	}

	public void setLanguages(LanguageSetInfo languages) {
		this.languages = languages;
	}

	public SkillSetInfo getSkills() {
		return skills;
	}

	public void setSkills(SkillSetInfo skills) {
		this.skills = skills;
	}

	public CertificationInfo getCertifications() {
		return certifications;
	}

	public void setCertifications(CertificationInfo certifications) {
		this.certifications = certifications;
	}

	public EducationInfo getEducations() {
		return educations;
	}

	public void setEducations(EducationInfo educations) {
		this.educations = educations;
	}

	public CourseSetInfo getCourses() {
		return courses;
	}

	public void setCourses(CourseSetInfo courses) {
		this.courses = courses;
	}

	public VoluteerInfo getVolunteers() {
		return volunteers;
	}

	public void setVolunteers(VoluteerInfo volunteers) {
		this.volunteers = volunteers;
	}

	public RecommendationInfo getRecommendations() {
		return recommendations;
	}

	public void setRecommendations(RecommendationInfo recommendations) {
		this.recommendations = recommendations;
	}
}
