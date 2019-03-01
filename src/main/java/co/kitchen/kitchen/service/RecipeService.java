package co.kitchen.kitchen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import co.kitchen.kitchen.model.Hit;
import co.kitchen.kitchen.model.Recipe;
import co.kitchen.kitchen.model.RecipesResponse;

@Component
public class RecipeService {
	
	@Value("${recipe.key}")
	private String key;
	private String appId = "8396f82d";

	private RestTemplate restTemplate = new RestTemplate();
	
	public List<Hit> findRecipes(String search) {

		String url = UriComponentsBuilder.fromHttpUrl("https://api.edamam.com/search")
				.queryParam("q", search)
				.queryParam("app_id", appId)
				.queryParam("app_key", key)
				.toUriString();
		
		System.out.println("SERVICE = " + url);
		
		RecipesResponse response = restTemplate.getForObject(url, RecipesResponse.class);
		
		return response.getHits();

	}
	
//	public List<Recipe> findRecipe(String uri) {
//		
//		String url = UriComponentsBuilder.fromHttpUrl("https://api.edamam.com/search")
//				.queryParam("r", uri)
//				.queryParam("app_id", appId)
//				.queryParam("app_key", key)
//				.toUriString();
//		
//		System.out.println("URL FINDRECIPE = " + url);
//		
//		ResponseEntity<List<Recipe>> response = restTemplate.exchange(url, HttpMethod.GET, null,
//		  new ParameterizedTypeReference<List<Recipe>>(){});
//		
//		System.out.println("RESPONSE SIZE = " + response.getBody().size());
//		
//		return response.getBody();
//
//	}

}
