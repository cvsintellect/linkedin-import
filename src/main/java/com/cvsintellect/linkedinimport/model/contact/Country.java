package com.cvsintellect.linkedinimport.model.contact;

import java.io.Serializable;

import org.simpleframework.xml.Element;

public class Country implements Serializable {
	private static final long serialVersionUID = 1L;

	@Element(required = false)
	private String code;

	public Country() {
		super();
	}

	public Country(String code) {
		super();
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
