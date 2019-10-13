package com.board.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.board.VO.BoardBean;

public class BoardDAO {

	public ArrayList<BoardBean> boardList(){
		
		Connection con;
		ArrayList<BoardBean> boardList = new ArrayList<BoardBean>();
		PreparedStatement pstmt;
		ResultSet rs;
		BoardBean board = new BoardBean();
		System.out.println("모라누");

		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("모라누");
			String url = "jdbc:mysql://localhost/jsp?serverTimezone=UTC";
			con = DriverManager.getConnection(url, "roott", "akscl");
			String sql = "select * from board";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				
				System.out.println("여기는");
				board.setBoardNum(rs.getInt(1));
				board.setSubject(rs.getString(2));
				board.setContent(rs.getString(3));
				board.setFile_Name(rs.getString(4));
				boardList.add(board);
			}
		}catch(Exception e){
				
			e.printStackTrace();
			
			}
		
		
		return boardList;
		
	}
	
}
