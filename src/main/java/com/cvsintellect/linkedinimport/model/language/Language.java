package com.cvsintellect.linkedinimport.model.language;

import java.io.Serializable;

import org.simpleframework.xml.Element;

public class Language implements Serializable {
	private static final long serialVersionUID = 1L;

	@Element(required = false)
	private String name;

	public Language() {
		super();
	}

	public Language(String name) {
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
