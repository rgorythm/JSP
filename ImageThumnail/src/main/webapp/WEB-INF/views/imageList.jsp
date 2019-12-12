<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
${ImageList }
${imageList }
	<table>
	<c:forEach var="ImageList" items="${ImageList }">
		<tr>
			<td>
				<img src="${pageContext.request.contextPath}/image/${ImageList.boardImg }">
			</td>
			<td>
				<img src="${pageContext.request.contextPath}/imageT/${ImageList.boardImgT }">
			</td>
		</tr>
	</table>
	</c:forEach>
</body>
</html>