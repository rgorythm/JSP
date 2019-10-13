<%@page import="com.board.VO.BoardBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
	
	<% 
     	ArrayList<BoardBean> boardList = (ArrayList<BoardBean>)request.getAttribute("boardList"); 
    %> 
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border=1>
		<tr>
			<td>번호</td>
			<td>제목</td>
			<td>내용</td>
			<td>파일</td>
		</tr>
		<%
			for(int i = 0; i<boardList.size(); i++){
		%>
		<tr>
			<td><%=boardList.get(i).getBoardNum() %></td>
			<td><%=boardList.get(i).getSubject() %></td>
			<td><%=boardList.get(i).getContent() %></td>
			<td><%=boardList.get(i).getFile_Name() %></td>
		</tr>
		<% 
			}
		%>
		

	</table>
</body>
</html>