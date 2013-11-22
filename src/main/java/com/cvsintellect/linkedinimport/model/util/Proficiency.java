package com.cvsintellect.linkedinimport.model.util;

import java.io.Serializable;

import org.simpleframework.xml.Element;

public class Proficiency implements Serializable {
	private static final long serialVersionUID = 1L;

	@Element
	private String level;

	@Element(required = false)
	private String name;

	public Proficiency() {
		super();
	}

	public Proficiency(String level, String name) {
		super();

		this.level = level;
		this.name = name;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
