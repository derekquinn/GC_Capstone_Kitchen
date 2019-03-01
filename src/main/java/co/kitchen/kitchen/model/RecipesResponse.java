package co.kitchen.kitchen.model;

import java.util.List;

public class RecipesResponse {
	
	private String q;//search field
	private Integer count;
	private List<Hit> hits;
	
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
	
	public List<Hit> getHits() {
		return hits;
	}
	
	public void setHits(List<Hit> hits) {
		this.hits = hits;
	}
	
	@Override
	public String toString() {
		return "RecipeResponse [q=" + q + ", count=" + count + ", hits=" + hits + "]";
	}

}
