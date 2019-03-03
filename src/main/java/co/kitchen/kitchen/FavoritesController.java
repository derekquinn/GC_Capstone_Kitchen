package co.kitchen.kitchen;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.kitchen.kitchen.dao.FavoritesDao;
import co.kitchen.kitchen.entity.Favorite;
import co.kitchen.kitchen.model.Recipe;

@Controller
public class FavoritesController {
	
	@Autowired
	private FavoritesDao favoritesDao;
	
	// ADD AN ITEM / PRODUCT
		@RequestMapping("/favorite")
		public ModelAndView addItem() {
			
			System.out.println("FAVORITE CONTROLLER");
			
			List<Favorite> favorites = favoritesDao.findAll();
			return new ModelAndView("favorites", "favorites", favorites);
		}

		@RequestMapping("/favorite-add")
		public ModelAndView favoriteAdd(@RequestParam("favorite") Recipe aRecipe) {
			
			System.out.println("RECIPE = " + aRecipe);
			
			Favorite aFavorite = new Favorite();
			aFavorite.setLabel(aRecipe.getLabel());
			aFavorite.setImage(aRecipe.getImage());
			aFavorite.setUrl(aRecipe.getUrl());
			
			System.out.println("aFavorite = " + aFavorite);
			System.out.println("aRecipe = " + aRecipe);
			
			if (favoritesDao.contains(aFavorite)) {
				favoritesDao.delete(aFavorite);
			} else {
				favoritesDao.create(aFavorite);
			}
			return new ModelAndView("redirect:/recipes");
		}

	// DELETE AN ITEM / PRODUCT

//		@RequestMapping("/item/delete")
//		public ModelAndView delete(@RequestParam("id") Long id) {
//			favoritesDao.delete(id);
//			return new ModelAndView("redirect:/admin");
//		}

}
