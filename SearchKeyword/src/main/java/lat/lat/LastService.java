package lat.lat;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

@Service
public class LastService {
	@Inject
	LastDAO dao;
	
	public int boardCountList() {
		return dao.boardCountList();
	}
	
	public List<BoardVO> boardList(SearchKeyword searchKeyword){
		return dao.boardList(searchKeyword);
	}
}
