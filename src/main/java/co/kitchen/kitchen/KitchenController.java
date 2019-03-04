package co.kitchen.kitchen;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

import co.kitchen.kitchen.entity.User;

@Controller
public class KitchenController {

	@RequestMapping("/")
	public ModelAndView showIndex() {
		return new ModelAndView("redirect:/home");
	}
	
	@RequestMapping("/home")
	public ModelAndView home(@SessionAttribute(name="profile", required=false) User aUser) {
		return new ModelAndView("index", "profile", aUser);
	}
}
