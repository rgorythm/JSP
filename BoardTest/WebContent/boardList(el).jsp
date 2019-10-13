<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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
		<c:forEach var = "boardList" items="${boardList}" varStatus="status">
		<tr>	
			<td>${boardList.boardNum }</td>
			<td>${boardList.subject }</td>
			<td>${boardList.content }</td>
			<td>${boardList.file_Name }</td>
		</tr>
		</c:forEach>
	
</body>
</html>