<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>글번호 : <label>${boardDetail.boardNum }</label></td>
		</tr>
		<tr>
			<td>글제목 : <label>${boardDetail.boardSubject }</label></td>
		</tr>
		<tr>
			<td>글내용 : <label>${boardDetail.boardContent}</label></td>
		</tr>
		<tr>
			<td><a href="./boardModifyForm?boardNum=${boardDetail.boardNum }"><input type="button" value="글수정"></a></td>
			<td><a href="./boardDelete?boardNum=${boardDetail.boardNum }"><input type="button" value="글삭제"></a></td>
			<td><a href="./boardList"><input type="button" value="글목록"></a></td>
		</tr>
	</table>
</body>
</html>