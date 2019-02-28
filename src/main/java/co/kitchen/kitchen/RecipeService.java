package co.kitchen.kitchen;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import co.kitchen.kitchen.model.Recipe;
import co.kitchen.kitchen.model.RecipeResponse;

@Component
public class RecipeService {
	@Value("${recipe.key}")
	private String key;
	private String appId = "8396f82d";

	private RestTemplate restTemplate = new RestTemplate();

	public List<Recipe> findRecipes(String search) {

		String url = UriComponentsBuilder.fromHttpUrl("https:api.edamam.com/search")
				.queryParam("q", search)
				.queryParam("appid", appId)
				.queryParam("recipe.key", key)
				.toUriString();

		RecipeResponse response = restTemplate.getForObject(url, RecipeResponse.class);

		return response.getHits();

	}

}
