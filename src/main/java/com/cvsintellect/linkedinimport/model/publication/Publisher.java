package com.cvsintellect.linkedinimport.model.publication;

import java.io.Serializable;

import org.simpleframework.xml.Element;

public class Publisher implements Serializable {
	private static final long serialVersionUID = 1L;

	@Element(required = false)
	private String name;

	public Publisher() {
		super();
	}

	public Publisher(String name) {
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
