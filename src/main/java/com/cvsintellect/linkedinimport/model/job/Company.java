package com.cvsintellect.linkedinimport.model.job;

import org.simpleframework.xml.Element;

import java.io.Serializable;

public class Company implements Serializable {
	private static final long serialVersionUID = 1L;

	@Element(name = "id", required = false)
	private String linkedinId;

	@Element(required = false)
	private String name;

	public Company() {
		super();
	}

	public Company(String linkedinId, String name) {
		super();
		this.linkedinId = linkedinId;
		this.name = name;
	}

	public String getLinkedinId() {
		return linkedinId;
	}

	public void setLinkedinId(String linkedinId) {
		this.linkedinId = linkedinId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
