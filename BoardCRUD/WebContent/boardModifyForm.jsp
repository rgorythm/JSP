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
<form action="./boardModify.test4" method="post">
	<table  align="center">
		<tr>
			<td><input type="hidden" name="boardNum" value="<%=boardBean.getBoardNum() %>"></td>
		</tr>
		<tr>
			<td><input type="text" name="boardSubject" value="<%=boardBean.getBoardSubject() %>"></td>
		</tr>
		<tr>
			<td><textarea rows="10" cols="30" name="boardContent"><%=boardBean.getBoardContent() %></textarea></td>
		</tr>
		<tr>
			<td><input type="text" name="boardFile_name" value="<%=boardBean.getBoardFile_name() %>"></td>
		</tr>
		<tr>
			<th><input type="submit" value="수정"></th>
			<th><input type="button" onclick="history.back()" value="뒤로"></th>
		</tr>
	</table>
</form>
</body>
</html>