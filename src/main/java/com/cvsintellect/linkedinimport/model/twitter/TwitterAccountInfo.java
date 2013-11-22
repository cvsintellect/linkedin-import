package com.cvsintellect.linkedinimport.model.twitter;

import java.io.Serializable;
import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;

public class TwitterAccountInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Attribute
	private int total;

	@ElementList(entry = "twitter-account", inline = true, required = false)
	private List<TwitterAccount> twitterAccounts;

	public TwitterAccountInfo() {
		super();
	}

	public TwitterAccountInfo(int total, List<TwitterAccount> twitterAccounts) {
		super();
		this.total = total;
		this.twitterAccounts = twitterAccounts;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<TwitterAccount> getTwitterAccounts() {
		return twitterAccounts;
	}

	public void setTwitterAccounts(List<TwitterAccount> twitterAccounts) {
		this.twitterAccounts = twitterAccounts;
	}
}
