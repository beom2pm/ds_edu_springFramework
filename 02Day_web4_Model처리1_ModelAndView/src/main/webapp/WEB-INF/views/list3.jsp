<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>반복문- scope에 저장된 값 출력 및 status</h3>
<c:forEach var="m" items="${xyz}" varStatus="status">
  ${status.index}:${m.userid}:${m.passwd}<br>
</c:forEach>
</body>
</html>