<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="javax.servlet.RequestDispatcher"
    %>
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
	
	request.getRequestDispatcher("request2.jsp").forward(request, response);
%>


</body>
</html>