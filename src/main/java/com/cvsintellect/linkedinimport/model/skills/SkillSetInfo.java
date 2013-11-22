package com.cvsintellect.linkedinimport.model.skills;

import java.io.Serializable;
import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;

public class SkillSetInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Attribute
	private int total;

	@ElementList(entry = "skill", inline = true, required = false)
	private List<SkillSet> skillSet;

	public SkillSetInfo() {
		super();
	}

	public SkillSetInfo(int total, List<SkillSet> skillSet) {
		super();
		this.total = total;
		this.skillSet = skillSet;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<SkillSet> getSkillSet() {
		return skillSet;
	}

	public void setSkillSet(List<SkillSet> skillSet) {
		this.skillSet = skillSet;
	}
}
