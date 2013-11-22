package com.cvsintellect.linkedinimport.model.certification;

import java.io.Serializable;
import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;

public class CertificationInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Attribute
	private int total;

	@ElementList(entry = "certification", inline = true, required = false)
	private List<Certification> certifications;

	public CertificationInfo() {
		super();
	}

	public CertificationInfo(int total, List<Certification> certifications) {
		super();
		this.total = total;
		this.certifications = certifications;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<Certification> getCertifications() {
		return certifications;
	}

	public void setCertifications(List<Certification> certifications) {
		this.certifications = certifications;
	}
}
