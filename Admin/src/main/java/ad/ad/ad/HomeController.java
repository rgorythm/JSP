package ad.ad.ad;

import java.text.DateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeController {
	@Inject
	Service service;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		List<UserVO> userList = service.userList();
		System.out.println("뭐야왜안떠");
		model.addAttribute("userList", userList);
		return "userList";
	}
	@ResponseBody
	@RequestMapping(value = "/selectUserDelete", method = RequestMethod.POST)
	public int selectDeleteUser(@RequestParam(value="checkBox[]") List<String> userIDs) {
													//  얘말하는거임변수이름 ㅡㅡ
		System.out.println("컨트롤러온다");
		
		int data = service.usersDelete(userIDs);
		return data;
	}
	@RequestMapping(value = "/basic", method = RequestMethod.GET)
	public String basic()  {
		return "basic";
	}
	
}
