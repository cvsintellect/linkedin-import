package com.cvsintellect.linkedinimport.model.contact;

import java.io.Serializable;

import org.simpleframework.xml.Element;

public class Location implements Serializable {
	private static final long serialVersionUID = 1L;

	@Element(required = false)
	private String name;

	@Element(required = false)
	private Country country;

	public Location() {
		super();
	}

	public Location(String name, Country country) {
		super();
		this.name = name;
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}
}
