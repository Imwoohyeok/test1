<%@ page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<img src="https://pakhotin.org/wp-content/uploads/2023/09/nba_default_image-1024x512.jpg">	

	<% 
    String name = request.getParameter("name");
	
    if (name != null) {
    	name = URLDecoder.decode(name, "UTF-8");
    }
    %>
        
	<div>
		이미지 이름 : <%= name %>
	</div>
</body>
</html>