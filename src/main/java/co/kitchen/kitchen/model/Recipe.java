package co.kitchen.kitchen.model;

import java.util.List;

public class Recipe extends Hit {
	
	private String uri;
	private String label;
	private String image;
	private String source;
	private String url;
	private String shareAs;
	private Integer yield;
	private List<String> dietLabels;
	private List<String> healthLabels;
	private List<String> cautions;
	private List<Ingredient> ingredients;
	private Double calories;
	private Double totalWeight;
	private Double totalTime;
	private Nutrients totalNutrients;
	
	public String getUri() {
		return uri;
	}
	
	public void setUri(String uri) {
		this.uri = uri;
	}
	
	public String getLabel() {
		return label;
	}
	
	public void setLabel(String label) {
		this.label = label;
	}
	
	public String getImage() {
		return image;
	}
	
	public void setImage(String image) {
		this.image = image;
	}
	
	public String getSource() {
		return source;
	}
	
	public void setSource(String source) {
		this.source = source;
	}
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getShareAs() {
		return shareAs;
	}

	public void setShareAs(String shareAs) {
		this.shareAs = shareAs;
	}
	
	public Integer getYield() {
		return yield;
	}

	public void setYield(Integer yield) {
		this.yield = yield;
	}

	public Double getCalories() {
		return calories;
	}

	public void setCalories(Double calories) {
		this.calories = calories;
	}

	public Double getTotalWeight() {
		return totalWeight;
	}

	public void setTotalWeight(Double totalWeight) {
		this.totalWeight = totalWeight;
	}
	
	

}
