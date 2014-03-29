package com.cvsintellect.linkedinimport.model.contact;

import org.simpleframework.xml.Element;

import java.io.Serializable;

public class IMAccount implements Serializable {
	private static final long serialVersionUID = 1L;

	@Element(name = "id", required = false)
	private String id;

	@Element(name = "im-account-type", required = false)
	private String type;

	@Element(name = "im-account-name", required = false)
	private String name;

	public IMAccount() {
		super();
	}

	public IMAccount(String id, String type, String name) {
		super();
		this.id = id;
		this.type = type;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
