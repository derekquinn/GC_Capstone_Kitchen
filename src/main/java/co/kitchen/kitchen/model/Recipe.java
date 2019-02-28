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
	private Nutrients totalDaily;
	
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
	public List<String> getDietLabels() {
		return dietLabels;
	}
	public void setDietLabels(List<String> dietLabels) {
		this.dietLabels = dietLabels;
	}
	public List<String> getHealthLabels() {
		return healthLabels;
	}
	public void setHealthLabels(List<String> healthLabels) {
		this.healthLabels = healthLabels;
	}
	public List<String> getCautions() {
		return cautions;
	}
	public void setCautions(List<String> cautions) {
		this.cautions = cautions;
	}
	public List<Ingredient> getIngredients() {
		return ingredients;
	}
	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
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
	public Double getTotalTime() {
		return totalTime;
	}
	public void setTotalTime(Double totalTime) {
		this.totalTime = totalTime;
	}
	public Nutrients getTotalNutrients() {
		return totalNutrients;
	}
	public void setTotalNutrients(Nutrients totalNutrients) {
		this.totalNutrients = totalNutrients;
	}
	public Nutrients getTotalDaily() {
		return totalDaily;
	}
	public void setTotalDaily(Nutrients totalDaily) {
		this.totalDaily = totalDaily;
	}
	
	@Override
	public String toString() {
		return "Recipe [uri=" + uri + ", label=" + label + ", image=" + image + ", source=" + source + ", url=" + url
				+ ", shareAs=" + shareAs + ", yield=" + yield + ", dietLabels=" + dietLabels + ", healthLabels="
				+ healthLabels + ", cautions=" + cautions + ", ingredients=" + ingredients + ", calories=" + calories
				+ ", totalWeight=" + totalWeight + ", totalTime=" + totalTime + ", totalNutrients=" + totalNutrients
				+ ", totalDaily=" + totalDaily + "]";
	}
	
}
