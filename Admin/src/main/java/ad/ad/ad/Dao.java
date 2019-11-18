package ad.ad.ad;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class Dao {
	@Inject
	SqlSession sql;
	
	public List<UserVO> getUserList(){
		
		return sql.selectList("user.userList");
		
	}
	public void usersDelete(String userID) {
		sql.delete("user.usersDelete", userID);
	}
}
