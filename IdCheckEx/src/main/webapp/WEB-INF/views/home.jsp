<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<form action="./goCheck" method="post">
		<table>
			<tr>
				<th>
					ID : <input type="text" name="userID">
				</th>
			</tr>
			<tr>
				<th>
					<input type="submit" value="보내기">
				</th>
			</tr>
		</table>
	</form>
</body>
</html>
