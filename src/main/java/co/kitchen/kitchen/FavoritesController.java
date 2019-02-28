package co.kitchen.kitchen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.kitchen.kitchen.dao.FavoritesDao;
import co.kitchen.kitchen.model.Recipe;

@Controller
public class FavoritesController {
	
	@Autowired
	private FavoritesDao favoritesDao;
	
	// ADD AN ITEM / PRODUCT
		@RequestMapping("/add-item")

		public ModelAndView addItem() {

			return new ModelAndView("/add-item");
		}

		@PostMapping("/add-item")
		public ModelAndView submitCreateForm(@RequestParam("favorite") Recipe aRecipe) {
			favoritesDao.create(aRecipe);
			return new ModelAndView("redirect:/admin");
		}

	// DELETE AN ITEM / PRODUCT

//		@RequestMapping("/item/delete")
//		public ModelAndView delete(@RequestParam("id") Long id) {
//			favoritesDao.delete(id);
//			return new ModelAndView("redirect:/admin");
//		}

}
