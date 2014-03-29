package com.cvsintellect.linkedinimport.model.patent;

import java.io.Serializable;
import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;

public class InventorInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Attribute(required = false)
	private int total;

	@ElementList(entry = "inventor", inline = true, required = false)
	private List<Inventor> inventors;

	public InventorInfo() {
		super();
	}

	public InventorInfo(int total, List<Inventor> inventors) {
		super();
		this.total = total;
		this.inventors = inventors;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<Inventor> getInventors() {
		return inventors;
	}

	public void setInventors(List<Inventor> inventors) {
		this.inventors = inventors;
	}
}
