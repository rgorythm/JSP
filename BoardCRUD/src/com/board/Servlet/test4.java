package com.board.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.board.Service.BoardService;

@WebServlet("*.test4")
public class test4 extends HttpServlet {
	protected void doTest4(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String contextPath = request.getContextPath();
		//BoardCRUD
		String uri = request.getRequestURI();
		//BoardCRUD/boardList.test4
		String requestName = uri.substring(contextPath.length());
		//BoardCRUD/boardList.test4 에서 BoardCRUD를뗀것같음
		if(requestName.equals("/boardList.test4")) {
			System.out.println(requestName);
			BoardService boardService = new BoardService();
			boardService.boardList(request, response);
			
		}else if(requestName.equals("/boardWrite.test4")) {
			System.out.println(requestName);
			BoardService boardService = new BoardService();
			boardService.boardWrite(request, response);

		}else if(requestName.equals("/boardDetail.test4")) {
			System.out.println(requestName);
			BoardService boardService = new BoardService();
			boardService.boardDetail(request, response);

		}else if(requestName.equals("/boardModifyForm.test4")) {
			System.out.println(requestName);
			BoardService boardService = new BoardService();
			boardService.boardModifyForm(request, response);

		}else if(requestName.equals("/boardModify.test4")) {
			System.out.println(requestName);
			BoardService boardService = new BoardService();
			boardService.boardModify(request, response);

		}else if(requestName.equals("/boardDelete.test4")) {
			System.out.println(requestName);
			BoardService boardService = new BoardService();
			boardService.boardDelete(request, response);

		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doTest4(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
