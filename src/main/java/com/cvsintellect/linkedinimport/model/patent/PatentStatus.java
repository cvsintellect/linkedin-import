package com.cvsintellect.linkedinimport.model.patent;

import java.io.Serializable;

import org.simpleframework.xml.Element;

public class PatentStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Element(name = "id")
	private String linkedinId;

	@Element(required = false)
	private String name;

	public PatentStatus() {
		super();
	}

	public PatentStatus(String linkedinId, String name) {
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
