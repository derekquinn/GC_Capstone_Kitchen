package co.kitchen.kitchen;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.kitchen.kitchen.dao.FavoriteHitDao;
import co.kitchen.kitchen.model.Hit;

@Controller
public class FavoritesController {
	
	@Autowired
	private FavoriteHitDao favoriteHitDao;
	
	// DISPLAY FAVORITES
		@RequestMapping("/favorite")
		public ModelAndView addItem() {
			
			System.out.println("FAVORITE CONTROLLER");
			
			List<Hit> favorites = favoriteHitDao.findAll();
			return new ModelAndView("favorites", "favorites", favorites);
		}

//		@RequestMapping("/favorite/add")
//		public ModelAndView favoriteAdd(@ModelAttribute("favorite") Hit aFavorite) {
//			
//			if (favoriteHitDao.contains(aFavorite)) {
//				favoriteHitDao.delete(aFavorite);
//			} else {
//				favoriteHitDao.create(aFavorite);
//			}
//			
//			return new ModelAndView("redirect:/favorite");
//		}

	// DELETE AN ITEM / PRODUCT

		@RequestMapping("/favorite/{id}/delete")
		public ModelAndView delete(@PathVariable("id") Long id) {
			favoriteHitDao.delete(id);
			return new ModelAndView("redirect:/favorite");
		}

}
