package com.board.Servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.board.Service.BoardService;
import com.board.VO.BoardBean;

@WebServlet("/bs")
public class Controller extends HttpServlet {
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		BoardService boardService = new BoardService();
		ArrayList<BoardBean> boardList = null;
		boardList = boardService.boardList();
		RequestDispatcher go = null;
		
		request.setAttribute("boardList", boardList);
		go = request.getRequestDispatcher("boardList.jsp");
		go.forward(request, response);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		doProcess(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
