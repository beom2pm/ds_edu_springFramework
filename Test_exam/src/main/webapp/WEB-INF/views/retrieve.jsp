<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Board 글쓰기 화면</title>
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<!-- 부가적인 테마 -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<h2>게시판 글 자세히보기</h2>
		<form action="update" method="post">
			<div class="form-group">
				<label for="num">글번호</label> <input type="text"
					class="form-control" name="num" value="${xyz.num}" readonly="readonly">
			</div>
			<div class="form-group">
				<label for="readcnt">조회수</label> <input type="text"
					class="form-control" name="readcnt" value="${xyz.readcnt}" readonly="readonly">
			</div>
			<div class="form-group">
				<label for="title">제목</label> <input type="text"
					class="form-control" name="title" value="${xyz.title}">
			</div>
			<div class="form-group">
				<label for="author">작성자</label> <input type="text"
					class="form-control" name="author" value="${xyz.author}">
			</div>
			<div class="form-group">
				<label for="content">내용</label>
				<textarea class="form-control" rows="3" name="content">${xyz.content}</textarea>
			</div>
			<button type="submit" class="btn btn-default">수정</button>
		</form>
		<a href="list">목록</a>
		<a href="delete?num=${xyz.num}">삭제</a>

	</div>
</body>
</html>