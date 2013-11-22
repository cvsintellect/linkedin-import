package com.cvsintellect.linkedinimport.model.contact;

import java.io.Serializable;
import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;

public class IMAccountInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Attribute
	private int total;

	@ElementList(entry = "im-account", inline = true, required = false)
	private List<IMAccount> imAccounts;

	public IMAccountInfo() {
		super();
	}

	public IMAccountInfo(int total, List<IMAccount> imAccounts) {
		super();
		this.total = total;
		this.imAccounts = imAccounts;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<IMAccount> getImAccounts() {
		return imAccounts;
	}

	public void setImAccounts(List<IMAccount> imAccounts) {
		this.imAccounts = imAccounts;
	}
}
