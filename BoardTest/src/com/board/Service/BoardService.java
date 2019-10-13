package com.board.Service;

import java.util.ArrayList;

import com.board.DAO.BoardDAO;
import com.board.VO.BoardBean;

public class BoardService {

	public ArrayList<BoardBean> boardList(){
		
		BoardDAO boardDAO = new BoardDAO();
		ArrayList<BoardBean> boardList = null;
		boardList = boardDAO.boardList();
		
		return boardList;
		
	}
	
}
