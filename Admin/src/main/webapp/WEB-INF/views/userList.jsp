<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="http://code.jquery.com/jquery-3.1.0.min.js"></script>


<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
	<tr>
		<th>userID</th>
		<th>userPASS</th>
		<th>regDate</th>
	</tr>
	<c:forEach var="userList" items="${userList }">
	<tr>
		<th><input type="checkbox" class="checkBox" data-userID="${userList.userID }"/>${userList.userID }</th>
		<th>${userList.userPASS }</th>
		<th>${userList.regDate }</th>
	</tr>
	</c:forEach>
	<tr>
		<th colspan="3"><button type="button" id="selectDelete">선택삭제</button></th>
	</tr>
<script>
			//#이  id=""  .이 class="" 인듯?
		 $("#selectDelete").click(function(){
		  var confirm_val = confirm("선택한 사용자를 삭제 하시겠습니까?");
		  
		  if(confirm_val) {
		   var checkArr = new Array();
		   $("input[class='checkBox']:checked").each(function(){
		    checkArr.push($(this).attr("data-userID"));
		   });
		    console.log("여긴온다고");
		   $.ajax({
		    url : "selectUserDelete",
		    type : "post",
		    		//"checkBox" 이이가 컨트롤러에서 받는 변수이름임 ㅡㅡ"
		    data : { "checkBox" : checkArr },
		    success : function(data){
		  		 console.log("여기와여");
		  		 if(data == 1){
		    		location.href = "./";
		  		 }else{
		  			 alert("삭제실패");
		  		 }
		    },
		    error : function(request,status,error) {
				alert(" message = " + request.responseText);
					console.log("실패");
			}
		   });
		  } 
		 });
</script>
</table>
</body>
</html>