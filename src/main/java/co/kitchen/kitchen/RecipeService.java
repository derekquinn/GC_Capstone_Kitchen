package co.kitchen.kitchen;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import co.kitchen.kitchen.model.Recipe;

@Component
public class RecipeService {
	
	private RestTemplate restTemplate = new RestTemplate();
	
	public List<Recipe> findRecipes(String search){
		
		String url = "https://api.edamam.com/search?q=" + search + "&app_id=8396f82d&app_key=ff9b8e6e921e07b1146fe0ba6abb4ec7";
		return null;
		
	}

}
