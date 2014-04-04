package com.cvsintellect.linkedinimport.oauth;

import com.cvsintellect.linkedinimport.model.main.JobSearchInfo;
import com.cvsintellect.linkedinimport.model.main.PersonProfile;
import org.brickred.socialauth.plugin.Plugin;

import java.util.List;

public interface CVsIntellectLinkedInPlugin extends Plugin {
	public PersonProfile getProfile() throws Exception;

	public List<PersonProfile> getContactList() throws Exception;

	public JobSearchInfo getJobs(String companyName, String countryCode);
}
