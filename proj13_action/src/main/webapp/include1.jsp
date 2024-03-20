<%@ page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div>page include</div>
<%@  include file="image.jsp" %>
<hr>
<hr>

<!-- include 는 합쳐짐 위에 코드랑 밑에 코드 둘다 화면에 출력됨 -->
<div>jsp action include</div>
<jsp:include page="image.jsp">
	<jsp:param name="name" value='<%= URLEncoder.encode("한글") %>'></jsp:param>
</jsp:include>

</body>
</html>