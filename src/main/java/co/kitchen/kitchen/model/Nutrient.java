package co.kitchen.kitchen.model;

public class Nutrient {

	private String label;
	private Double quantity;
	private String unit;
	
	public String getLabel() {
		return label;
	}
	
	public void setLabel(String label) {
		this.label = label;
	}
	
	public Double getQuantity() {
		return quantity;
	}
	
	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}
	
	public String getUnit() {
		return unit;
	}
	
	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	@Override
	public String toString() {
		return "Nutrient [label=" + label + ", quantity=" + quantity + ", unit=" + unit + "]";
	}
	
}
