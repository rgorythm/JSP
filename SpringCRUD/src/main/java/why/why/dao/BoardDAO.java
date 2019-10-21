package why.why.dao;

import java.util.List;

import why.why.domain.BoardVO;

public interface BoardDAO {

		public List<BoardVO> listAll() throws Exception;
		
		public void boardWrite(BoardVO boardVO) throws Exception;
		
		public BoardVO boardDetail(int boardNum) throws Exception;
		
		public void boardModify(BoardVO boardVO) throws Exception;
		
		public void boardDelete(int boardNum) throws Exception;
}
