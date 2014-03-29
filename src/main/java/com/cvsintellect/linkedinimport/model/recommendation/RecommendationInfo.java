package com.cvsintellect.linkedinimport.model.recommendation;

import java.io.Serializable;
import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;

public class RecommendationInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Attribute(required = false)
	private int total;

	@ElementList(entry = "recommendation", inline = true, required = false)
	private List<Recommendation> recommendations;

	public RecommendationInfo() {
		super();
	}

	public RecommendationInfo(int total, List<Recommendation> recommendations) {
		super();
		this.total = total;
		this.recommendations = recommendations;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<Recommendation> getRecommendations() {
		return recommendations;
	}

	public void setRecommendations(List<Recommendation> recommendations) {
		this.recommendations = recommendations;
	}
}
