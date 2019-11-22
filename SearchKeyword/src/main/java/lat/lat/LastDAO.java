package lat.lat;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class LastDAO {
	@Inject
	SqlSession sql;
	
	public int boardCountList() {
		return sql.selectOne("last.boardCountList");
	}
	
	public List<BoardVO> boardList(SearchKeyword searchKeyword){
		return sql.selectList("last.boardList",searchKeyword);
	}
}
