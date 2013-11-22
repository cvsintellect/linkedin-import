package com.cvsintellect.linkedinimport.model.language;

import java.io.Serializable;
import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;

public class LanguageSetInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Attribute
	private int total;

	@ElementList(entry = "language", inline = true, required = false)
	private List<LanguageSet> languageSet;

	public LanguageSetInfo() {
		super();
	}

	public LanguageSetInfo(int total, List<LanguageSet> languageSet) {
		super();
		this.total = total;
		this.languageSet = languageSet;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<LanguageSet> getLanguageSet() {
		return languageSet;
	}

	public void setLanguageSet(List<LanguageSet> languageSet) {
		this.languageSet = languageSet;
	}
}
