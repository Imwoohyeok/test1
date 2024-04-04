<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import= "woo.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


 <h2>프로필</h2>
    <div>
        <h3>사용자 정보</h3>
        <p>ID: <%= request.getAttribute("id") %></p>
        <!-- 기타 사용자 정보 출력 -->
    </div>
    <div>
        <h3>프로필 사진</h3>
        <img src="C:/fff/<%= request.getAttribute("img_filename") %>" alt="프로필 사진">
    </div>
</body>
</html>