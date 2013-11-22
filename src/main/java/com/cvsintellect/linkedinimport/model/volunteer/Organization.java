package com.cvsintellect.linkedinimport.model.volunteer;

import java.io.Serializable;

import org.simpleframework.xml.Element;

public class Organization implements Serializable {
	private static final long serialVersionUID = 1L;

	@Element(required = false)
	private String name;

	public Organization() {
		super();
	}

	public Organization(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
