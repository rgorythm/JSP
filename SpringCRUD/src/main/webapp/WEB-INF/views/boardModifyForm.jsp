<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="./boardModify" method="post">
	<table  align="center">
		<tr>
			<td><input type="hidden" name="boardNum" value="${boardDetail.boardNum }"></td>
		</tr>
		<tr>
			<td>글제목<input type="text" name="boardSubject" value="${boardDetail.boardSubject }"></td>
		</tr>
		<tr>
			<td>글내용<textarea rows="10" cols="30" name="boardContent">${boardDetail.boardContent }</textarea></td>
		</tr>
		<tr>
			<th><input type="submit" value="수정"></th>
			<th><input type="button" onclick="history.back()" value="뒤로"></th>
		</tr>
	</table>
</form>
</body>
</html>