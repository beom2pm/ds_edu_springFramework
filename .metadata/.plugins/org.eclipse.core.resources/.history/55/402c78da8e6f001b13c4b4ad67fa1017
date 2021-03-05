<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<img src="image/a.png" width="100" height="100">
	<h3>글목록</h3>
	<table border="1">
		<tr>
			<th>글번호</th>
			<th>제목1</th>
			<th>제목2</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>조회수</th>
		</tr>
	<c:forEach var="board" items="${boardList}">
		<tr>
			<td>${board.num}</td>
			<!-- query -->
			<td><a href="retrieve?num=${board.num}">${board.title}</a></td>
			<!-- restful -->
			<td><a href="retrieve2/num/${board.num}">${board.title}</a></td>
			<td>${board.author}</td>
			<td>${board.writeday}</td>
			<td>${board.readcnt}</td>
		</tr>
	</c:forEach>
	</table>
	<a href="writeUI">글쓰기</a>
</body>
</html>