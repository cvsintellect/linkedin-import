package com.cvsintellect.linkedinimport.parser;

import com.cvsintellect.linkedinimport.model.main.ConnectionInfo;
import com.cvsintellect.linkedinimport.model.main.JobSearchInfo;
import com.cvsintellect.linkedinimport.model.main.PersonProfile;
import org.junit.Test;

import java.io.File;

public class HRXMLParserIntegrationTest {
	@Test
	public void shouldLoadDataCorrectly() throws Exception {
		File personSource = new File(this.getClass().getResource("/test-data/linkedin-response-person.xml").getFile());
		PersonProfile person = HRXMLParser.parsePersonInformation(personSource);
		System.out.println(person.getEmailAddress());
		System.out.println(person);

		File connectionsSource = new File(this.getClass().getResource("/test-data/linkedin-response-contact.xml").getFile());
		ConnectionInfo connectionInfo = HRXMLParser.parseConnectionsInformation(connectionsSource);
		System.out.println(connectionInfo);

		File jobsSource = new File(this.getClass().getResource("/test-data/linkedin-response-job.xml").getFile());
		JobSearchInfo jobSearchInfo = HRXMLParser.parseJobSearchInformation(jobsSource);
		System.out.println(jobSearchInfo);
	}
}
