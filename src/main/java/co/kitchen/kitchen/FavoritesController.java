package co.kitchen.kitchen;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.kitchen.kitchen.dao.FavoritesDao;

@Controller
public class FavoritesController {
	
	// ADD AN ITEM / PRODUCT
		@RequestMapping("/add-item")

		public ModelAndView addItem() {

			return new ModelAndView("/add-item");
		}

		@PostMapping("/add-item")
		public ModelAndView submitCreateForm(Recipe aRecipe) {
			FavoritesDao.create(aRecipe);
			return new ModelAndView("redirect:/admin");
		}

	// DELETE AN ITEM / PRODUCT

		@RequestMapping("/item/delete")
		public ModelAndView delete(@RequestParam("id") Long id) {
			FavoritesDao.delete(id);
			return new ModelAndView("redirect:/admin");
		}

}
