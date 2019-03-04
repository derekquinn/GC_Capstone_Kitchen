package co.kitchen.kitchen;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

import co.kitchen.kitchen.dao.FavoriteHitDao;
import co.kitchen.kitchen.entity.User;
import co.kitchen.kitchen.model.Hit;

@Controller
public class FavoritesController {
	
	@Autowired
	private FavoriteHitDao favoriteHitDao;
	
	// DISPLAY FAVORITES
		@RequestMapping("/favorites")
		public ModelAndView addItem(@SessionAttribute(name="profile", required=false) User aUser) {	

				List<Hit> favorites = favoriteHitDao.findByUserId(aUser.getId());
				System.out.println("favorites length = " + favorites.size());
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

		@RequestMapping("/favorites/{id}/delete")
		public ModelAndView delete(@PathVariable("id") Long id) {
			favoriteHitDao.delete(id);
			return new ModelAndView("redirect:/favorite");
		}

}
