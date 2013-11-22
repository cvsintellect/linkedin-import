package com.cvsintellect.linkedinimport.parser;

import java.io.File;

import org.junit.Test;

import com.cvsintellect.linkedinimport.model.main.ConnectionInfo;
import com.cvsintellect.linkedinimport.model.main.PersonProfile;
import com.cvsintellect.linkedinimport.parser.HRXMLParser;

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
	}
}
