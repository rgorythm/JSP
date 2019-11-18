package id.id.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import id.id.vo.UserVO;
@Repository
public class Dao {
	@Inject
	SqlSession sql;
	
	public UserVO idCheck(UserVO userVO) {
		return sql.selectOne("check.selectID", userVO);
	}
}
