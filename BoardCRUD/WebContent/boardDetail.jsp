<%@page import="com.board.VO.BoardBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    	<%
    		BoardBean boardBean = (BoardBean)request.getAttribute("boardBean");
    	%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>글번호 : <label><%= boardBean.getBoardNum() %></label></td>
		</tr>
		<tr>
			<td>글제목 : <label><%= boardBean.getBoardSubject() %></label></td>
		</tr>
		<tr>
			<td>글내용 : <label><%= boardBean.getBoardContent() %></label></td>
		</tr>
		<tr>
			<td>파일이름:<label><%= boardBean.getBoardFile_name() %></label></td>
		</tr>
		<tr>
			<td><a href="./boardModifyForm.test4?boardNum=<%=boardBean.getBoardNum()%>"><input type="button" value="글수정"></a></td>
			<td><a href="./boardDelete.test4?boardNum=<%=boardBean.getBoardNum()%>"><input type="button" value="글삭제"></a></td>
			<td><a href="./boardList.test4"><input type="button" value="글목록"></a></td>
		</tr>
	</table>
</body>
</html>