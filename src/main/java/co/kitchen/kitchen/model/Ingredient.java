package co.kitchen.kitchen.model;

public class Ingredient {
	
	private String text;
	private Double weight;
	
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	public Double getWeight() {
		return weight;
	}
	
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "Ingredient [text=" + text + ", weight=" + weight + "]";
	}

}
