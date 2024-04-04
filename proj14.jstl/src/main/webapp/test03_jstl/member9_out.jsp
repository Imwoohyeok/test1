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

param.id : ${param.id } <br>
<c:out value="asd" /><br>

특수문자를 치환해서 문자 그자체로 출력되게 해줌<br>
<c:out value="${param.id }" /><br>

< &lt; :  <br>
> &gt; :	<br>
& &amp; :	<br>
" "(공백문자) : &nbsp;	<br>




</body>
</html>

