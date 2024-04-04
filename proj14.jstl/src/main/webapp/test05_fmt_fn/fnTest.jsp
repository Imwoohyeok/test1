<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:set var="title" value="영일이삼사오육칠팔구영일이삼사오육칠팔구" />

title에 글자수가 몇글자인지?<br>
\${fn:length(title) } : ${fn:length(title) } <br>
<hr>

3번째글자부터 6번째 글자 전까지 추출<br>
\${fn:substring(title, 3, 6) } : ${fn:substring(title, 3, 6) } <br>
<hr>

"오"를 5로 바꾸기<br>
\${fn:replace(title, "오", "5") } : ${fn:replace(title, "오", "5") }<br>
<hr>

"팔" 이 몇번째 인지 확인<br>
\${fn:indexOf(title, "팔") } : ${fn:indexOf(title, "팔") }<br>
<hr>

title에 "구" 가 있는지<br>
\${fn:contains(title, "구") } : ${fn:contains(title, "구") }<br>


</body>
</html>