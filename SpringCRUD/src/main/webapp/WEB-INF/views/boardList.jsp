<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
${boardList }
<table border="1">
	<tr>
		<td>번호</td><td>제목</td><td>내용</td>
	</tr>
	<c:forEach var="boardList" items="${boardList}">
	<tr onclick="location.href='./boardDetail?boardNum=${boardList.boardNum}'">
		<td>${boardList.boardNum }</td><td>${boardList.boardSubject }</td><td>${boardList.boardContent }</td>
	</tr>
	</c:forEach>
	<tr>
		<td colspan="3"><a href="./boardWriteForm"><input type="button" value="글쓰기"></a></td>
	</tr>
</table>
</body>
</html>
