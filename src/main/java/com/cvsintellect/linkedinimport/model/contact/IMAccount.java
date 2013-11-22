package com.cvsintellect.linkedinimport.model.contact;

import java.io.Serializable;

import org.simpleframework.xml.Element;

public class IMAccount implements Serializable {
	private static final long serialVersionUID = 1L;

	@Element(name = "im-account-type", required = false)
	private String type;

	@Element(name = "im-account-name", required = false)
	private String name;

	public IMAccount() {
		super();
	}

	public IMAccount(String type, String name) {
		super();
		this.type = type;
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
