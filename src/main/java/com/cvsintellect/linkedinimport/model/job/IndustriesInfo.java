package com.cvsintellect.linkedinimport.model.job;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;

import java.util.List;

public class IndustriesInfo {
	@Attribute(required = false)
	private int total;

	@ElementList(entry = "industry", inline = true, required = false)
	private List<Industry> industries;

	public IndustriesInfo() {
		super();
	}

	public IndustriesInfo(int total, List<Industry> industries) {
		super();
		this.total = total;
		this.industries = industries;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<Industry> getIndustries() {
		return industries;
	}

	public void setIndustries(List<Industry> industries) {
		this.industries = industries;
	}
}
