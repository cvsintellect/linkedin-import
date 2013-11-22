package com.cvsintellect.linkedinimport.model.recommendation;

import java.io.Serializable;

import org.simpleframework.xml.Element;

public class Recommendation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Element(name = "id")
	private String linkedinId;

	@Element(name = "recommendation-type", required = false)
	private RecommendationType recommendationType;

	@Element(name = "recommendation-text", required = false)
	private String recommendationText;

	@Element(name = "recommender", required = false)
	private Recommender recommender;

	public Recommendation() {
		super();
	}

	public Recommendation(String linkedinId, RecommendationType recommendationType, String recommendationText, Recommender recommender) {
		super();
		this.linkedinId = linkedinId;
		this.recommendationType = recommendationType;
		this.recommendationText = recommendationText;
		this.recommender = recommender;
	}

	public String getLinkedinId() {
		return linkedinId;
	}

	public void setLinkedinId(String linkedinId) {
		this.linkedinId = linkedinId;
	}

	public RecommendationType getRecommendationType() {
		return recommendationType;
	}

	public void setRecommendationType(RecommendationType recommendationType) {
		this.recommendationType = recommendationType;
	}

	public String getRecommendationText() {
		return recommendationText;
	}

	public void setRecommendationText(String recommendationText) {
		this.recommendationText = recommendationText;
	}

	public Recommender getRecommender() {
		return recommender;
	}

	public void setRecommender(Recommender recommender) {
		this.recommender = recommender;
	}
}
