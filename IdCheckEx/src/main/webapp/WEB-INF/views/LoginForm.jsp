<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="http://code.jquery.com/jquery-3.1.0.min.js"></script>
<script>
$(function(){
	$("#userID").blur(function() {
		//ID중복정규식?
		var idJ = /^[a-z0-9]{4,12}$/
		$.ajax({
			url : "goCheck",
			type : "POST",
			data : {"userID":$("#userID").val()},
			success : function(data) {
				//data값 불린임 참이면 아이디사용가능
				if (data) {
					if(idJ.test($("#userID").val())){
					$("#id_check").text("");
					$("#reg_submit").attr("disabled", false);
					
					}else if($("#userID").val()==""){
						$('#id_check').text('아이디를 입력해주세요 :)');
						$('#id_check').css('color', 'red');
						$("#reg_submit").attr("disabled", true);				
					} else {
						$('#id_check').text("아이디는 소문자와 숫자 4~12자리만 가능합니다 :)");
						$('#id_check').css('color', 'red');
						$("#reg_submit").attr("disabled", true);
					}
				} else {
					
					$("#id_check").text("사용중인 아이디입니다 :p");
					$("#id_check").css("color", "red");
					$("#reg_submit").attr("disabled", true);
			
				}
			}, 
			error : function(request,status,error) {
					alert(" message = " + request.responseText);
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
					<input type="submit" value="보내기" id="reg_submit">
				</th>
			</tr>
		</table>
	</form>
</body>
</body>
</html>