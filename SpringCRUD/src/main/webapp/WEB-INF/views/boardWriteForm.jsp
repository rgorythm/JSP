<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<body>
    <h2>글쓰기</h2>
    <form name="bdto" method="post" action="./boardWrite">
        <div>제목<input name="boardSubject" id="boardSubject" size="80" placeholder="글 제목 입력"></div>
        <div>내용<textarea name="boardContent" id="boardContent" rows="8" cols="80" placeholder="글 내용 입력"></textarea></div>
        <div style="width:650px; text-align:center;">
            <input type="submit" value="확인">
        </div>
    </form>
</body>
</body>
</html>