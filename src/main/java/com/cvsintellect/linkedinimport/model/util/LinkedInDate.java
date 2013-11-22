package com.cvsintellect.linkedinimport.model.util;

import java.io.Serializable;

import org.simpleframework.xml.Element;

public class LinkedInDate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Element(required = false)
	private int year;

	@Element(required = false)
	private int month;

	@Element(required = false)
	private int day;

	public LinkedInDate() {
		super();
	}

	public LinkedInDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
}
