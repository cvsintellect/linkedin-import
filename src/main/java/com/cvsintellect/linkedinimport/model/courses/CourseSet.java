package com.cvsintellect.linkedinimport.model.courses;

import java.io.Serializable;

import org.simpleframework.xml.Element;

public class CourseSet implements Serializable {
	private static final long serialVersionUID = 1L;

	@Element(name = "id")
	private String linkedinId;

	@Element(required = false)
	private String name;

	@Element(required = false)
	private String number;

	public CourseSet() {
		super();
	}

	public CourseSet(String linkedinId, String name, String number) {
		super();
		this.linkedinId = linkedinId;
		this.name = name;
		this.number = number;
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

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
}
