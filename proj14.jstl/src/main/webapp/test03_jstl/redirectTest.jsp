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
ㅁㄴㅇㅁㄴㅇㅁㄴ
<c:redirect url="member5_choose.jsp">
	<c:param name="name" value="이름" />
</c:redirect>

<%-- <c:redirect url="member5_choose.jsp?name=이름" /> --%>
<!-- 두개 적어도 오류는 안남  서블릿에서는 redirect 2개쓰면 오류남 -->

</body>
</html>