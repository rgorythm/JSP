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
	<table border=3>
		<tr>
			<td>글번호</td>
			<td>제목</td>
			<td>내용</td>
			<td>파일</td>
		</tr>
		<c:forEach var="boardList" items="${boardList }" varStatus="status">
		<tr onclick="location.href='./boardDetail.test4?boardNum=${boardList.boardNum }'">
			<td>${boardList.boardNum }</td>
			<td>${boardList.boardSubject }</td>
			<td>${boardList.boardContent }</td>
			<td>${boardList.boardFile_name }</td>
		</tr>
		</c:forEach>
		<tr>
			<th colspan="4">
				<a href="boardWriteForm.jsp"><input type="button" value="글쓰기"></a>
			</th>
		</tr>
</body>
</html>