package com.cvsintellect.linkedinimport.model.patent;

import java.io.Serializable;

import org.simpleframework.xml.Element;

public class PatentOffice implements Serializable {
	private static final long serialVersionUID = 1L;

	@Element(required = false)
	private String name;

	public PatentOffice() {
		super();
	}

	public PatentOffice(String name) {
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
