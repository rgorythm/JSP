package id.id.id;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import id.id.service.Service;
import id.id.vo.UserVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@Inject
	Service service;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "LoginForm";
	}
	@RequestMapping(value = "/basic", method = RequestMethod.GET)
	public String testt() {
		return "basicTest";
	}
	@RequestMapping(value = "/test2", method = RequestMethod.GET)
	public String testt2() {
		return "test2";
	}
	
	@ResponseBody
	@RequestMapping(value = "/goCheck", method = RequestMethod.POST)
	public Boolean idCheck(UserVO userVO) {
	/*	Boolean check = service.checkID(userVO);
		System.out.println(request.getParameter("userID"));
		System.out.println(check);
		System.out.println(request.getParameter("userID"));*/
		System.out.println(userVO.getUserID());
		boolean momy = false;
		return momy;
	}
	
}
