package com.cvsintellect.linkedinimport.model.patent;

import java.io.Serializable;
import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;

public class PatentInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Attribute(required = false)
	private int total;

	@ElementList(entry = "patent", inline = true, required = false)
	private List<Patent> patents;

	public PatentInfo() {
		super();
	}

	public PatentInfo(int total, List<Patent> patents) {
		super();
		this.total = total;
		this.patents = patents;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<Patent> getPatents() {
		return patents;
	}

	public void setPatents(List<Patent> patents) {
		this.patents = patents;
	}
}
