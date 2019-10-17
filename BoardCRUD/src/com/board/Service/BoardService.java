package com.board.Service;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.board.DAO.BoardDAO;
import com.board.VO.BoardBean;

public class BoardService {

	public void boardList(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		BoardDAO boardDAO = new BoardDAO();
		ArrayList<BoardBean> boardList = new ArrayList<BoardBean>();
		boardList = boardDAO.boardList();
		request.setAttribute("boardList", boardList);
		RequestDispatcher go = request.getRequestDispatcher("boardList.jsp");
		go.forward(request, response);

	}

	public void boardWrite(HttpServletRequest request, HttpServletResponse response) throws IOException {

		BoardDAO boardDAO = new BoardDAO();
		BoardBean boardBean = new BoardBean();
		String boardSubject = request.getParameter("boardSubject");
		String boardContent = request.getParameter("boardContent");
		String boardFile_name = request.getParameter("boardFile_name");
		boardBean.setBoardSubject(boardSubject);
		boardBean.setBoardContent(boardContent);
		boardBean.setBoardFile_name(boardFile_name);
		int insertCount = boardDAO.boardWrite(boardBean);
		if (insertCount > 0) {

			System.out.println("글쓰기성공");
			response.sendRedirect("boardList.test4");

		} else {

			System.out.println("글쓰기실패");

		}

	}

	public void boardDetail(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		BoardDAO boardDAO = new BoardDAO();
		int boardNum = Integer.parseInt(request.getParameter("boardNum"));
		BoardBean boardBean = new BoardBean();
		boardBean = boardDAO.boardDetail(boardNum);
		request.setAttribute("boardBean", boardBean);
		RequestDispatcher go = request.getRequestDispatcher("boardDetail.jsp?boardNum="+boardNum+"");
		go.forward(request, response);

	}

	public void boardModifyForm(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		BoardDAO boardDAO = new BoardDAO();
		int boardNum = Integer.parseInt(request.getParameter("boardNum"));
		BoardBean boardBean = new BoardBean();
		boardBean = boardDAO.boardDetail(boardNum);
		request.setAttribute("boardBean", boardBean);
		RequestDispatcher go = request.getRequestDispatcher("boardModifyForm.jsp?boardNum="+boardNum+"");
		go.forward(request, response);
	}

	public void boardModify(HttpServletRequest request, HttpServletResponse response) throws IOException {

		BoardDAO boardDAO = new BoardDAO();
		BoardBean boardBean = new BoardBean();
		int boardNum = Integer.parseInt(request.getParameter("boardNum"));
		String boardSubject = request.getParameter("boardSubject");
		String boardContent = request.getParameter("boardContent");
		String boardFile_name = request.getParameter("boardFile_name");
		boardBean.setBoardNum(boardNum);
		boardBean.setBoardSubject(boardSubject);
		boardBean.setBoardContent(boardContent);
		boardBean.setBoardFile_name(boardFile_name);
		int updateCount = boardDAO.boardModify(boardBean);
		if (updateCount > 0) {

			System.out.println("글수정성공");
			response.sendRedirect("boardDetail.test4?boardNum="+boardNum+"");

		} else {

			System.out.println("글수정실패");

		}

	}
	
	public void boardDelete(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		BoardDAO boardDAO = new BoardDAO();
		int boardNum = Integer.parseInt(request.getParameter("boardNum"));
		int deleteCount = 0;
		deleteCount = boardDAO.boardDelete(boardNum);
		if(deleteCount > 0) {
			
			System.out.println("글삭제성공");
			response.sendRedirect("boardList.test4");

			
		}else {
			
			System.out.println("글삭제실패");
			
		}
		
	}

}
