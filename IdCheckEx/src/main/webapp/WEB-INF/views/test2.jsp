<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="http://code.jquery.com/jquery-3.1.0.min.js"></script>
<script>
// 아이디 유효성 검사(1 = 중복 / 0 != 중복)
$(function(){
	$("#userID").blur(function() {
		// id = "id_reg" / name = "userId"
		$.ajax({
			url : "${pageContext.request.contextPath}/test",
			type : "POST",
			data : {"userID":$("#userID").val()},
			success : function(data) {
				alert("성공");
			}, 
			error : function(request,status,error) {
				alert("실패");
						console.log("실패");
				}
			});
		});
});
</script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<body>
	<form action="./goCheck" method="post">
		<table>
			<tr>
				<th>
					ID : <input type="text" name="userID" id="userID">
				</th>
			</tr>
			<tr>
				<th>
					<div class="check_font" id="id_check">d</div>
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
</body>
</html>