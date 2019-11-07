<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
</head>
<body>
	<h1 align="center">Hello world!</h1>
	<sec:authorize access="isAnonymous()">
		<h5>
			<a href='<c:url value="/loginForm"/>'>LOGIN</a> 로그인 해주세요.
		</h5>
	</sec:authorize>

	<sec:authorize access="isAuthenticated()">
		<form action="./logout" method="POST">
			<input type="hidden" name="${_csrf.parameterName}"
				value="${_csrf.token}" />
			<button type="submit">LOGOUT</button>
		</form>
	</sec:authorize>
	<table align = "center">
		<tr>
			<th><a href="./admin/adminpage"><input type="button"
					value="Admin"></a></th>
		</tr>
		<tr>
			<th><a href="./user/userpage"><input type="button"
					value="User"></a></th>
		</tr>
		<tr>
			<th><a href="./guest/guestpage"><input type="button"
					value="Guest"></a></th>
		</tr>
	</table>

</body>
</html>
