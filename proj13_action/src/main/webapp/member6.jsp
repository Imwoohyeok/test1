<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>member6.jsp</h1>

<%
	System.out.println("useBean 실행 전");
%>
<jsp:useBean id="m" class="sec01.ex01.MemberBean" scope="page"></jsp:useBean>

<%
	System.out.println("useBean 실행 후");
%>

<jsp:setProperty name="m" property="*"></jsp:setProperty>

</body>
</html>