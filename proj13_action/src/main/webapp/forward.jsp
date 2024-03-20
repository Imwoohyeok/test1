<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div>내가 보이나요?</div>

<!-- 위에 div는 출력 안됨 포워드를 시켜서 바로 include1.jsp 이쪽으로 이동함 -->
<jsp:forward page="include1.jsp"></jsp:forward>

</body>
</html>