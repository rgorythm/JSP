package ad.ad.ad;

import java.util.Iterator;
import java.util.List;

import javax.inject.Inject;
@org.springframework.stereotype.Service
public class Service {
	@Inject
	Dao dao;
	
	public List<UserVO> userList(){
		List<UserVO> userList = dao.getUserList();
		return userList;
		
	}
	
	public int usersDelete(List<String> userIDs) {
		//이터레이터 쓰는거좀 봐라 ㅡㅡ 아직도 못써서 우야노
		Iterator<String> iter = userIDs.iterator();
		if(iter.hasNext()) {
			 while(iter.hasNext()) {
				String userID = iter.next();
				dao.usersDelete(userID);
			 }
			 return 1;
		}
		return 0;
	}
}
