package scu.scu.scu;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {

		@Inject
		SqlSession sql;
		public CustomUserDetail userGet(String username) {
			System.out.println("DAO");
			return sql.selectOne("db.mapper.selectUser",username);

		}
}
