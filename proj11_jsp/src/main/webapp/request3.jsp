<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	request.setAttribute("name", "임우혁");
	request.setAttribute("address", "청주");
	
	response.sendRedirect("request2.jsp");
%>

</body>
</html>