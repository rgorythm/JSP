package id.id.service;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import id.id.dao.Dao;
import id.id.vo.UserVO;
@org.springframework.stereotype.Service
public class Service {
	@Inject
	Dao dao;
	@Inject
	UserVO userVO;
	
	public Boolean checkID(HttpServletRequest request) {
		String userID = request.getParameter("userID");
		userVO.setUserID(userID);
		UserVO vo = dao.idCheck(userVO);
		Boolean check = false;
		if(vo==null) check=true;
		return check;
	}
}
