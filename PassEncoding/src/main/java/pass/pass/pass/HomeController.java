package pass.pass.pass;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

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
	@Inject
	PassService service;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "loginForm";
	}
	@RequestMapping(value = "/userWrite", method = RequestMethod.POST)
	public String userWrite(PassVO passVO) throws Exception {
		service.insertUser(passVO);
		return "home";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginAction(PassVO passVO) throws Exception {
		service.selectUser(passVO);
		return "home";
	}
	@RequestMapping(value = "/userwriteform", method = RequestMethod.GET)
	public String userWriteForms(PassVO passVO) throws Exception {
		return "userWriteForm";
	}
	
}
