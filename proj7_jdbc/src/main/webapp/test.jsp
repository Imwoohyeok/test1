<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="test_0320.TestDAO"%>
<%@ page import="test_0320.TestDTO"%>
<%@ page import="test_0320.TestServlet"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<style>

table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}

</style>

<body>
<form method="get" action="testinsert" id="myform">
	<h1>현장 작업지시서</h1>
	<table>
		<thead>
			<tr>
				<td>NUM</td>
				<td>AMOUNT</td>
				<td>MENU</td>
				<td>TARGET</td>
			</tr>
		</thead>
		<tbody>
			<%
				TestDAO testDAO = new TestDAO();
			    // 목록을 가져오기
			    List<TestDTO> list = testDAO.listEmp();
			    
			    
			    for (int i = 0; i < list.size(); i++) {
			    // 각 정보를 가져오기
			    TestDTO testDTO = list.get(i);
		    %>
    
		    <tr>
		    
		    	<td style = "display:none"><input type="hidden" name="seq1" value="<%=testDTO.getSeq()%>"></td>
		    	<td><input type="text" name="num1" value="<%= testDTO.getNum() %>"></td>
		    	<td><input type="text" name="amount1" value="<%= testDTO.getAmount() %>"></td>
		    	<td><input type="text" name="menu1" value="<%= testDTO.getMenu() %>"></td>
		    	<td><input type="text" name="target1" value="<%= testDTO.getTarget() %>"></td>
		   		<td> <input type="button" class = "upbut" value="수정"></td>
		    </tr>
		    
        <% } %>
        	<tr>
		    	<td><input type="text" name="num"></td>
		    	<td><input type="text" name="amount"></td>
		    	<td><input type="text" name="menu"></td>
		    	<td><input type="text" name="target"></td>
				<td><input type="submit" name="" value="추가"></td>
		    </tr>
		</tbody>
			
	</table>
	<br>
</form>


<!-- <form method="get" action="testdelete"> -->

<!-- 	num 번호를 입력하면 삭제됩니다!!<br> -->
<!-- 	<input type="text" name="num">	 -->
<!-- 	<input type="submit" name="delete" value="삭제"> -->
<!-- </form> -->

<script>
	
	
	//수정 버튼에 대한 이벤트 리스너를 모두 추가
	document.querySelectorAll(".upbut").forEach(button => {
		button.addEventListener("click", function(event){
		    event.preventDefault(); // 기본 동작 방지
		    // 클릭된 버튼이 속한 폼을 찾음
		    let myform = button.closest("form");
		    // 폼의 action을 변경하여 수정 요청을 보낼 엔드포인트로 설정
		    myform.action = "testupdate";
		    // 수정된 폼을 제출
		    myform.submit();
		});
	});

	
// 	document.querySelector(".upbut").addEventListener("click", function(){
// 		let myform = document.querySelector("#myform");
// 		myform.action = "testupdate";
// 		myform.submit();
// 	})
	
</script>

</body>

</html>