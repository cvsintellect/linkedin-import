package com.cvsintellect.linkedinimport.model.twitter;

import java.io.Serializable;

import org.simpleframework.xml.Element;

public class TwitterAccount implements Serializable {
	private static final long serialVersionUID = 1L;

	@Element(name = "provider-account-id", required = false)
	private String providerAccountId;

	@Element(name = "provider-account-name", required = false)
	private String providerAccountName;

	public TwitterAccount() {
		super();
	}

	public TwitterAccount(String providerAccountId, String providerAccountName) {
		super();
		this.providerAccountId = providerAccountId;
		this.providerAccountName = providerAccountName;
	}

	public String getProviderAccountId() {
		return providerAccountId;
	}

	public void setProviderAccountId(String providerAccountId) {
		this.providerAccountId = providerAccountId;
	}

	public String getProviderAccountName() {
		return providerAccountName;
	}

	public void setProviderAccountName(String providerAccountName) {
		this.providerAccountName = providerAccountName;
	}
}
