<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="http://code.jquery.com/jquery-3.1.0.min.js"></script>
<script>
$(function(){
	$('#btnSubmit').click(function(){
		$('#uploadForm').submit();
		alert('아놔');
	});	
});
</script>
<title>Insert title here</title>
</head>
<body>
	<h1 text-align="center">이미지 업로드</h1>
	<form id="uploadForm" action="./imageUpload" method="post" enctype="multipart/form-data">
	<input type="hidden" name="boardTest" value="하하하">
		<table>
			<tr>
				<td>
					<label>이미지첨부:</label><input type="file" name="file">
															 <!--name 안주니까 안넘어감 파일값  -->
				</td>
				<td>
					<button type="button" id="btnSubmit">업로드</button>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>