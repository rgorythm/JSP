package scu.scu.scu;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		
		return "home";
	}
	@RequestMapping(value = "/loginForm", method = RequestMethod.GET)
	public String loginForm() {
		
		return "loginForm";
	}
	@RequestMapping(value = "/loginsucces", method = RequestMethod.GET)
	public String loginSucces() {
		
		return "home";
	}
	@RequestMapping(value = "/admin/adminpage", method = RequestMethod.GET)
	public String adminPage() {
		
		
		return "adminpage";
	}
	@RequestMapping(value = "/user/userpage", method = RequestMethod.GET)
	public String userPage() {
		
		
		return "userpage";
	}
	@RequestMapping(value = "/guest/guestpage", method = RequestMethod.GET)
	public String guestPage() {
		
		
		return "guestpage";
	}
	@RequestMapping(value = "/access_denied_page", method = RequestMethod.GET)
	public String errorpage403() {
		logger.info("에러페이지에여");
		
		return "errorpage";
	}
	
}
