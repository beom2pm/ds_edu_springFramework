<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>글 자세히 보기</h3>
	<form action="update" method="post">
	<input type="hidden" name="num" value="${xyz.num}">
		제목:<input type="text" name="title" value="${xyz.title}"><br>
		작성자:<input type="text" name="author"  value="${xyz.author}"><br>
		 내용:<textarea rows="20" cols="10" name="content">${xyz.content}</textarea><br>
		 <input type="submit" value="수정">
	</form>
	<a href="delete?num=${xyz.num}">삭제</a>
</body>
</html>