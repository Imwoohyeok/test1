<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입폼</title>
</head>
<style>
h1 {
	margin : auto;
	text-align: center;
}
table {
    border: 2px solid #000; /* 테두리 선 색상과 굵기 지정 */
    border-collapse: collapse;
    margin: 0 auto;
    margin-top: 10px;
  }

th, td {
    border: 1px solid #000; /* 내부 셀 테두리 선 색상과 굵기 지정 */
    padding: 10px; /* 셀 내부 여백 지정 */
}

th {
	background-color: #f2f2f2; /* 헤더 배경색 지정 */
}
  
.center {
    text-align: center;
}
</style>
<script>
	// 아이디 비번 체크
	function checkField(){
		let inputs = document.inputForm;
		if(!inputs.id.value){	// name속성이 id인 요소의 value가 없으면 true
			alert("아이디를 입력하세요.");
			return false;	// pro페이지로 이동 금지.
		}
		if(!inputs.pw.value){	
			alert("비밀번호를 입력하세요.");
			return false;
		}
		if(!inputs.pwchk.value){
			alert("비밀번호 확인란을 입력하세요.");
			return false;
		}
		// 비밀번호랑 비밀번호 확인란이 틀리면
		if(inputs.pw.value != inputs.pwchk.value){
			alert("비밀번호가 일치하지 않습니다.");
			return false;
		}
		if(inputs.phone.value != inputs.phone.value){
			alert("비밀번호가 일치하지 않습니다.");
			return false;
		}
	}
</script>
<body>

<h1>회원가입</h1>

<form method="post" name="inputForm" action="memberlist.jsp">
	<table>
		<tr>
			<td>아이디(*)</td>
			<td><input type="text" name="id"></td>
		</tr>
		<tr>
			<td>비밀번호(*)</td>
			<td><input type="text" name="pw"></td>
		</tr>
		<tr>
			<td>비밀번호 확인(*)</td>
			<td><input type="text" name="pwchk"></td>
		</tr>
		<tr>
			<td>휴대폰번호(*)</td>
			<td><input type="text" name="phone"></td>
		</tr>
		<tr>
			<td><div class="label">관심분야(*)</div></td>
			<td>
				<input type="checkbox" name="hobby" value="코딩" checked>코딩
			    <input type="checkbox" name="hobby" value="영화">영화
			    <input type="checkbox" name="hobby" value="운동">운동
			    <input type="checkbox" name="hobby" value="음악">음악
			</td>
		</tr>
		<tr>
			<td><div class="label">직업(*)</div></td>
			<td>
				<select name="job">
			        <option value="학생">학생</option>
			        <option value="공무원">공무원</option>
			        <option value="개발자">개발자</option>
				</select>
		    </td>
		</tr>
		<tr>
			<td><div class="label">연령대(*)</div></td>
			<td>
				<input type="radio" name="age" value="10">10대
		    	<input type="radio" name="age" value="20">20대
		    	<input type="radio" name="age" value="30">30대
		    	<input type="radio" name="age" value="40">40대
		    </td>
		</tr>
		<tr>
	    	<td colspan="2" class="center">
			<input type="submit" value= "회원가입">
			<input type="reset" value= "취소">
			</td>
	    </tr>
			
	</table>
</form>
	
</body>
</html>