<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="http://code.jquery.com/jquery-3.1.0.min.js"></script>
<script>
 
$(document).ready(function(){
    $( "#origin" ).blur(function(){
		console.log("1 = 중복o / 0 = 중복x : ");
        var origin = parseInt($("#origin").val());    
        var interest = (20/100)*origin;
        
        if($("#origin").val() == ""){
            $('#result').val("0");
        }else{
            $('#result').val(interest);
        }    
    });
});
 
</script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>원금 : <input type="text" id="origin"/></div>
    <div>이자 :  <input type="text" id="result" disabled/></div>
</body>
</html>