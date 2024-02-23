<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 키가 없으면 null 리턴
	Boolean isLogon = (Boolean)session.getAttribute("isLogon");

	if(isLogon == null || !isLogon){
		response.sendRedirect("cookieTest.jsp");
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	내 신상 정보, 민감한 정보 표시되는 중...
</body>
</html>