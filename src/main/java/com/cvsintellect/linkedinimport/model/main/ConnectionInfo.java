package com.cvsintellect.linkedinimport.model.main;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;

import java.util.List;

public class ConnectionInfo {
	@Attribute(required = false)
	private int total;

	@Attribute(required = false)
	private int count;

	@Attribute(required = false)
	private int start;

	@ElementList(entry = "person", inline = true, required = false)
	private List<PersonProfile> connectionProfiles;

	public ConnectionInfo() {
		super();
	}

	public ConnectionInfo(int total, int count, int start, List<PersonProfile> connectionProfiles) {
		super();
		this.total = total;
		this.count = count;
		this.start = start;
		this.connectionProfiles = connectionProfiles;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public List<PersonProfile> getConnections() {
		return connectionProfiles;
	}

	public void setConnections(List<PersonProfile> connectionProfiles) {
		this.connectionProfiles = connectionProfiles;
	}
}
