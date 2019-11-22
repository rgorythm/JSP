<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="true"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<script src="http://code.jquery.com/jquery-3.1.0.min.js"></script>
<script>
	$(document).on('click', '#btnSearch', function(e){
		e.preventDefault();
		var url = "${pageContext.request.contextPath}/boardList";
		url = url + "?searchType=" + $('#searchType').val();
										//인코딩
		url = url + "&keyword=" + encodeURIComponent($('#keyword').val());
		location.href = url
		console.log(url);
	});	
</script>
<style>
ul li {
	float: left;
}
</style>
<title>Home</title>
</head>
<body>
	<div style="padding: 30px;">
		<table border="1" align="right">
			<tr>
				<c:forEach var="boardList" items="${boardList}" varStatus="show">
					<td><a href="./boardDetail?boardNum=${boardList.boardNum}">
							<img
							src="C:\Users\kis2m\eclipse-workspace\MyBreakfast\src\main\webapp\upload/${boardList.boardImg}"
							width="200px" height="200px">
					</a><br>
						<p>${boardList.boardSubject}</p></td>
					<c:if test="${((show.index+1)mod 3)==0}">
			</tr>
			<tr>
				</c:if>
				</c:forEach>
			</tr>
			<tr>
				<td colspan="4" align="center"><a href="./boardWriteForm">
				<input type="button" value="글쓰기"></a></td>
			</tr>
		</table>
	</div>
	<br>
	<div>
		<ul>
			<c:if test="${pageMaker.prev }">
				<li><a
					href='<c:url value="./boardList?page=${pageMaker.startPage-1 }"/>'>이전</a>
				</li>
			</c:if>
			<c:forEach begin="${pageMaker.startPage }"
				end="${pageMaker.endPage }" var="idx">
				<li><a href='<c:url value="./boardList?page=${idx }"/>'>${idx }</a>
				</li>
			</c:forEach>
			<c:if test="${pageMaker.next && pageMaker.endPage >0 }">
				<li><a
					href='<c:url value="./boardList?page=${pageMaker.endPage+1 }"/>'>다음</a>
				</li>
			</c:if>
		</ul>
	</div>
			<div class="form-group row justify-content-center">
			<div class="w100" style="padding-right:10px">
				<select class="form-control form-control-sm" name="searchType" id="searchType">
					<option value="boardSubject">제목</option>
					<option value="boardContent">본문</option>
					<option value="boardWriter">작성자</option>
				</select>
			</div>
			<div class="w300" style="padding-right:10px">
				<input type="text" class="form-control form-control-sm" name="keyword" id="keyword">
			</div>
			<div>
				<button class="btn btn-sm btn-primary" name="btnSearch" id="btnSearch">검색</button>
			</div>
		</div>
</body>
</html>
