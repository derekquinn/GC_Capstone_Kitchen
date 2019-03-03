package co.kitchen.kitchen.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Type;

@Entity
public class Hit {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Embedded @Type(type="Recipe")
	private Recipe recipe;
	
	private Boolean bookmarked;
	private Boolean bought;
	
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Recipe getRecipe() {
		return recipe;
	}

	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}

	public Boolean getBookmarked() {
		return bookmarked;
	}

	public void setBookmarked(Boolean bookmarked) {
		this.bookmarked = bookmarked;
	}

	public Boolean getBought() {
		return bought;
	}

	public void setBought(Boolean bought) {
		this.bought = bought;
	}

	@Override
	public String toString() {
		return "Hit [recipe=" + recipe + ", bookmarked=" + bookmarked + ", bought=" + bought + "]";
	}
	
}
	
	