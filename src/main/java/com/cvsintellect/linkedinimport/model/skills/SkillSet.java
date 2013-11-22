package com.cvsintellect.linkedinimport.model.skills;

import java.io.Serializable;

import org.simpleframework.xml.Element;

import com.cvsintellect.linkedinimport.model.util.Proficiency;

public class SkillSet implements Serializable {
	private static final long serialVersionUID = 1L;

	@Element(name = "id")
	private String linkedinId;

	@Element(required = false)
	private Skill skill;

	@Element(required = false)
	private Proficiency proficiency;

	@Element(name = "years", required = false)
	private Duration duration;

	public SkillSet() {
		super();
	}

	public SkillSet(String linkedinId, Skill skill, Proficiency proficiency, Duration duration) {
		super();
		this.linkedinId = linkedinId;
		this.skill = skill;
		this.proficiency = proficiency;
		this.duration = duration;
	}

	public String getLinkedinId() {
		return linkedinId;
	}

	public void setLinkedinId(String linkedinId) {
		this.linkedinId = linkedinId;
	}

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	public Proficiency getProficiency() {
		return proficiency;
	}

	public void setProficiency(Proficiency proficiency) {
		this.proficiency = proficiency;
	}

	public Duration getDuration() {
		return duration;
	}

	public void setDuration(Duration duration) {
		this.duration = duration;
	}
}
