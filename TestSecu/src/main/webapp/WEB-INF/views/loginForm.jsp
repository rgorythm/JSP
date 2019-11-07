<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta id="_csrf" name="_csrf" content="${_csrf.token}" />
<meta id="_csrf_header" name="_csrf_header" content="${_csrf.headerName}" />
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Login Page!!</h1>
	<form action="./login" method="post">
		<input name="${_csrf.parameterName}" type="hidden" value="${_csrf.token}" />
		<table align="center">
			<tr>
				<th>UserID:</th>
				<th><input type="text" name="userID"></th>
			</tr>
			<tr>
				<th>UserPASS:</th>
				<th><input type="password" name="userPASS"></th>
			</tr>
			<tr>
				<th colspan="2"><input type="submit" value="Login"></th>
			</tr>
		</table>
	</form>
</body>
</html>