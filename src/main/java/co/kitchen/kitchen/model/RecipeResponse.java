package co.kitchen.kitchen.model;

import java.util.List;

public class RecipeResponse {
	
	private String q;//search field
	private Integer count;
	private List<Recipe> hits;
	
	public String getQ() {
		return q;
	}
	
	public void setQ(String q) {
		this.q = q;
	}
	
	public Integer getCount() {
		return count;
	}
	
	public void setCount(Integer count) {
		this.count = count;
	}
	
	public List<Recipe> getHits() {
		return hits;
	}
	
	public void setHits(List<Recipe> hits) {
		this.hits = hits;
	}
	
	@Override
	public String toString() {
		return "RecipeResponse [q=" + q + ", count=" + count + ", hits=" + hits + "]";
	}

}
