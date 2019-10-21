package why.why.dao;

import java.sql.Connection;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import why.why.domain.BoardVO;
@Repository
public class BoardDAOImp implements BoardDAO{
	@Inject
	private SqlSession sqlSession;
	
	private static String namespace = "why.why.mapper.boardMapper";
	@Override
	public List<BoardVO> listAll() throws Exception{
		// TODO Auto-generated method stub
		
		return sqlSession.selectList(namespace+".boardList");
	}
	@Override
	public void boardWrite(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.insert(namespace+".boardWrite",boardVO);
	}
	@Override
	public BoardVO boardDetail(int boardNum) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(namespace+".boardDetail",boardNum);
	}
	@Override
	public void boardModify(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.update(namespace+".boardModify",boardVO);
	}
	@Override
	public void boardDelete(int boardNum) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.delete(namespace+".boardDelete",boardNum);
	}

}
