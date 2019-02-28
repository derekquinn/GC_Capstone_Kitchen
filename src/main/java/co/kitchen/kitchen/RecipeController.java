package co.kitchen.kitchen;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.kitchen.kitchen.model.Recipe;

@Controller
public class RecipeController {

	@Autowired
	private RecipeService recipeService;

	@RequestMapping("/recipes")
	public ModelAndView searchRecipes(@RequestParam(name="search", defaultValue="brisket") String search) {
		
		List<Recipe> recipes = recipeService.findRecipes(search);
		
		return new ModelAndView("recipes", "recipes", recipes);
		
	}
	
}