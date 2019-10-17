package com.board.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.board.VO.BoardBean;

public class BoardDAO {
	
	DataSource ds;
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	

	public BoardDAO() {
		
		try {
			
			Context context = new InitialContext();
			ds = (DataSource)context.lookup("java:comp/env/jdbc/MySQLDB");
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
	}

	public ArrayList<BoardBean> boardList() {

		ArrayList<BoardBean> boardList = new ArrayList<BoardBean>();

		try {
			con = ds.getConnection();
			String sql = "select * from board";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				BoardBean boardBean = new BoardBean();
				boardBean.setBoardNum(rs.getInt("num"));
				boardBean.setBoardSubject(rs.getString("subject"));
				boardBean.setBoardContent(rs.getString("content"));
				boardBean.setBoardFile_name(rs.getString("file_name"));
				boardList.add(boardBean);
			}

		} catch (Exception e) {

			e.printStackTrace();

		}finally {
			try {
				if(con != null) con.close();
				if(pstmt != null) pstmt.close();
				System.out.println("자원해제");
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
		return boardList;

	}

	public int boardWrite(BoardBean boardBean) {

		int insertCount = 0;

		try {
			
			con = ds.getConnection();
			String sql = "insert into board(subject, content, file_name) values(?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, boardBean.getBoardSubject());
			pstmt.setString(2, boardBean.getBoardContent());
			pstmt.setString(3, boardBean.getBoardFile_name());
			insertCount = pstmt.executeUpdate();
			
		} catch (Exception e) {

		}finally {
			try {
				if(con != null) con.close();
				if(pstmt != null) pstmt.close();
				System.out.println("자원해제");
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
		return insertCount;

	}

	public BoardBean boardDetail(int boardNum) {

		BoardBean boardBean = new BoardBean();
		
		try {
			
			con = ds.getConnection();
			String sql = "select * from board where num="+boardNum+"";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
				while(rs.next()) {
					boardBean.setBoardNum(boardNum);
					boardBean.setBoardSubject(rs.getString("subject"));
					boardBean.setBoardContent(rs.getString("content"));
					boardBean.setBoardFile_name(rs.getString("file_name"));
					
				}
			
		} catch (Exception e) {

		}finally {
			try {
				if(con != null) con.close();
				if(pstmt != null) pstmt.close();
				System.out.println("자원해제");
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
		return boardBean;

	}

	public int boardModify(BoardBean boardBean) {

		int updateCount = 0;

		try {
			
			con = ds.getConnection();
			String sql = "update board set subject=?, content=?, file_name=? where num ="+boardBean.getBoardNum()+"";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, boardBean.getBoardSubject());
			pstmt.setString(2, boardBean.getBoardContent());
			pstmt.setString(3, boardBean.getBoardFile_name());
			updateCount = pstmt.executeUpdate();
			
			
		} catch (Exception e) {

			e.printStackTrace();
			
		}finally {
			try {
				if(con != null) con.close();
				if(pstmt != null) pstmt.close();
				System.out.println("자원해제");
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
		return updateCount;

	}

	public int boardDelete(int boardNum) {

		int deleteCount = 0;

		try {
			
			con = ds.getConnection();
			String sql = "delete from board where num ="+boardNum+"";
			pstmt = con.prepareStatement(sql);
			deleteCount = pstmt.executeUpdate();
			
		} catch (Exception e) {

			e.printStackTrace();
			
		}finally {
			try {
				if(con != null) con.close();
				if(pstmt != null) pstmt.close();
				System.out.println("자원해제");
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
		return deleteCount;

	}
}
