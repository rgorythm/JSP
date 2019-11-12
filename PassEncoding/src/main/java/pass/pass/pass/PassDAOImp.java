package pass.pass.pass;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
@Repository
public class PassDAOImp implements PassDAO{
	@Inject
	SqlSession sql;
	
	@Override
	public void insertUser(PassVO passVO) throws Exception {
		// TODO Auto-generated method stub
		sql.insert("testmapper.insertUser",passVO);
	}

	@Override
	public PassVO selectUser(PassVO passVO) throws Exception {
		// TODO Auto-generated method stub
		return sql.selectOne("testmapper.selectUser", passVO);
	}

	@Override
	public PassVO selectUser2() throws Exception {
		// TODO Auto-generated method stub
		return sql.selectOne("testmapper.selectUser2");
	}

}
