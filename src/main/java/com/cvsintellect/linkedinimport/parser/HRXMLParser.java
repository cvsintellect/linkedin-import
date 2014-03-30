package com.cvsintellect.linkedinimport.parser;

import com.cvsintellect.linkedinimport.model.main.ConnectionInfo;
import com.cvsintellect.linkedinimport.model.main.JobSearchInfo;
import com.cvsintellect.linkedinimport.model.main.PersonProfile;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import java.io.File;
import java.io.InputStream;

public class HRXMLParser {
	public static PersonProfile parsePersonInformation(File inputFile) throws Exception {
		Serializer serializer = new Persister();

		PersonProfile person = serializer.read(PersonProfile.class, inputFile);

		return person;
	}

	public static PersonProfile parsePersonInformation(InputStream inputStream) throws Exception {
		Serializer serializer = new Persister();

		PersonProfile person = serializer.read(PersonProfile.class, inputStream);

		return person;
	}

	public static PersonProfile parsePersonInformation(String input) throws Exception {
		Serializer serializer = new Persister();

		PersonProfile person = serializer.read(PersonProfile.class, input);

		return person;
	}

	public static ConnectionInfo parseConnectionsInformation(File inputFile) throws Exception {
		Serializer serializer = new Persister();

		ConnectionInfo connectionInfo = serializer.read(ConnectionInfo.class, inputFile);

		return connectionInfo;
	}

	public static ConnectionInfo parseConnectionsInformation(InputStream inputStream) throws Exception {
		Serializer serializer = new Persister();

		ConnectionInfo connectionInfo = serializer.read(ConnectionInfo.class, inputStream);

		return connectionInfo;
	}

	public static ConnectionInfo parseConnectionsInformation(String input) throws Exception {
		Serializer serializer = new Persister();

		ConnectionInfo connectionInfo = serializer.read(ConnectionInfo.class, input);

		return connectionInfo;
	}

	public static JobSearchInfo parseJobSearchInformation(File inputFile) throws Exception {
		Serializer serializer = new Persister();

		JobSearchInfo jobSearchInfo = serializer.read(JobSearchInfo.class, inputFile);

		return jobSearchInfo;
	}

	public static JobSearchInfo parseJobSearchInformation(InputStream inputStream) throws Exception {
		Serializer serializer = new Persister();

		JobSearchInfo jobSearchInfo = serializer.read(JobSearchInfo.class, inputStream);

		return jobSearchInfo;
	}

	public static JobSearchInfo parseJobSearchInformation(String input) throws Exception {
		Serializer serializer = new Persister();

		JobSearchInfo jobSearchInfo = serializer.read(JobSearchInfo.class, input);

		return jobSearchInfo;
	}
}
