<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="./boardWrite.test4" post="method">
	<table  align="center">
		<tr>
			<td><input type="text" name="boardSubject" placeholder="제목"></td>
		</tr>
		<tr>
			<td><textarea rows="10" cols="30" name="boardContent">글내용</textarea></td>
		</tr>
		<tr>
			<td><input type="text" name="boardFile_name" placeholder="파일이름"></td>
		</tr>
		<tr>
			<th><input type="submit" value="글쓰기"></th>
			<th><input type="button" onclick="history.back()" value="뒤로가기"></th>

		</tr>
	</table>
</form>
</body>
</html>