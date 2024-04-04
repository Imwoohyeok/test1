<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 페이지</title>
</head>
<body>
	<h2>회원가입</h2>
    <form action="upload" method="post" 
    	enctype="multipart/form-data"
    	accept-charset="utf-8">
        ID: <input type="text" name="id"><br>
        Password: <input type="password" name="pw"><br>
        프로필 사진 업로드: 
        <button type="button" id="btn1">파일선택</button>
		<input type="file" name="file" id="file" style="display:none;"><br>
        <br>
        <input type="submit" value="가입하기">
    </form>
    
    <script>
	document.querySelector("#btn1").addEventListener("click", function(){
		document.querySelector("#file").click();		
	})
</script>
</body>
</html>