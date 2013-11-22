package com.cvsintellect.linkedinimport.model.contact;

import java.io.Serializable;

import org.simpleframework.xml.Element;

public class PhoneNumber implements Serializable {
	private static final long serialVersionUID = 1L;

	@Element(name = "phone-type", required = false)
	private String type;

	@Element(name = "phone-number", required = false)
	private String number;

	public PhoneNumber() {
		super();
	}

	public PhoneNumber(String type, String number) {
		super();
		this.type = type;
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
}
