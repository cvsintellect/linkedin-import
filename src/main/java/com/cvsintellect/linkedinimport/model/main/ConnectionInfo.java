package com.cvsintellect.linkedinimport.model.main;

import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;

public class ConnectionInfo {
	@Attribute
	private int total;
	
	@ElementList(entry = "person", inline = true, required = false)
	private List<PersonProfile> connectionProfiles;

	public ConnectionInfo() {
		super();
	}

	public ConnectionInfo(int total, List<PersonProfile> connectionProfiles) {
		super();
		this.total = total;
		this.connectionProfiles = connectionProfiles;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<PersonProfile> getConnections() {
		return connectionProfiles;
	}

	public void setConnections(List<PersonProfile> connectionProfiles) {
		this.connectionProfiles = connectionProfiles;
	}
}
