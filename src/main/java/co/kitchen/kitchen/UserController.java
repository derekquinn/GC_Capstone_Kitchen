package co.kitchen.kitchen;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import co.kitchen.kitchen.dao.UserDao;
import co.kitchen.kitchen.entity.User;

@Controller
public class UserController {

	@Autowired
	private UserDao userDao;

	// LOGIN

	@RequestMapping("/user-login")

	public ModelAndView showLogin() {

		return new ModelAndView("/user-login");
	}

	@PostMapping("/user-login")
	// get the username and password from the form when it's submitted.
	public ModelAndView submitLoginForm(@RequestParam("username") String username, @RequestParam("password") String password,
			HttpSession session, RedirectAttributes redir) {
		// Find the matching user.
		User aUser = userDao.findByUsername(username);
		if (aUser == null || !password.equals(aUser.getPassword())) {
			// If the user or password don't match, display an error message.
			ModelAndView mav = new ModelAndView("user-login");
			mav.addObject("message", "Incorrect username or password.");
			return mav;
		}

		// On successful login, add the user to the session.
		session.setAttribute("profile", aUser);

		// A flash message will only show on the very next page. Then it will go away.
		// It is useful with redirects since you can't add attributes to the mav.
		redir.addFlashAttribute("message", "Logged in.");
		return new ModelAndView("redirect:/");
	}

	// LOGOUT
	@RequestMapping({ "/logout" })
	public ModelAndView logout(HttpSession session, RedirectAttributes redir) {
		session.invalidate();
		redir.addFlashAttribute("Logged out now. Be good today.");
		return new ModelAndView("redirect:/");
	}

	// ADD A USER
	@RequestMapping("/user-registration")

	public ModelAndView showUserRegistration() {

		return new ModelAndView("/user-registration");
	}

	// USER SESSIONS

	// Use @SessionAttribute to get item from session
	@RequestMapping("/user-registration-result")
	public ModelAndView showEditProfile(@SessionAttribute(name = "profile", required = false) User aUser) {
		return new ModelAndView("user-registration-result", "user", aUser);
	}

	// Use HttpSession to set an attribute on the session
	@PostMapping("/user-registration-result")
	public ModelAndView submitEditProfile(User aUser, @RequestParam("confirm-password") String confirmPassword,
			HttpSession session, RedirectAttributes redir) {

		User existingUser = userDao.findByUsername(aUser.getUsername());

		if (existingUser != null) {
			// If user already exists, display an error message.
			return new ModelAndView("user-registration", "message", "A user with that username already exists.");
		}

		if (!confirmPassword.equals(aUser.getPassword())) {
			// If the user or passwords don't match, display an error message.
			return new ModelAndView("user-registration", "message", "Passwords do not match.");
		}

		session.setAttribute("profile", aUser);
		userDao.create(aUser);
		redir.addFlashAttribute("message", "Thanks for signing up!");
		return new ModelAndView("redirect:/");

	}

}
