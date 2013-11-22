package com.cvsintellect.linkedinimport.model.contact;

import java.io.Serializable;
import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;

public class ContactNumberInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Attribute
	private int total;

	@ElementList(entry = "phone-number", inline = true, required = false)
	private List<PhoneNumber> phoneNumbers;

	public ContactNumberInfo() {
		super();
	}

	public ContactNumberInfo(int total, List<PhoneNumber> phoneNumbers) {
		super();
		this.total = total;
		this.phoneNumbers = phoneNumbers;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<PhoneNumber> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
}
