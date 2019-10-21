package why.why.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import why.why.dao.BoardDAO;
import why.why.domain.BoardVO;
@Service
public class BoardServiceImp implements BoardService{
	@Inject
	private BoardDAO dao;
	
	@Override
	public List<BoardVO> listAll() throws Exception {
		// TODO Auto-generated method stub
		return dao.listAll();
	}

	@Override
	public void boardWrite(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		dao.boardWrite(boardVO);
	}

	@Override
	public BoardVO boardDetail(int boardNum) throws Exception {
		// TODO Auto-generated method stub
		return dao.boardDetail(boardNum);
	}

	@Override
	public void boardModify(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		dao.boardModify(boardVO);
	}

	@Override
	public void boardDelete(int boardNum) throws Exception {
		// TODO Auto-generated method stub
		dao.boardDelete(boardNum);
	}

}
