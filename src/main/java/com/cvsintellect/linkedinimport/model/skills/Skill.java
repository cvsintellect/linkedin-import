package com.cvsintellect.linkedinimport.model.skills;

import java.io.Serializable;

import org.simpleframework.xml.Element;

public class Skill implements Serializable {
	private static final long serialVersionUID = 1L;

	@Element(required = false)
	private String name;

	public Skill() {
		super();
	}

	public Skill(String name) {
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
