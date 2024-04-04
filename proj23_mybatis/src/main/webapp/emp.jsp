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
<style>
	.ename {
		cursor: pointer;
	}
</style>
<script>

let keyword = '${keyword}';
let type = '${type}';

window.onload = ()=>{}
window.addEventListener("load", ()=>{
// 	// class를 이용해서 선택
// 	let enames = document.querySelectorAll(".ename")
	// id의 패턴을 이용해서 선택
	let enames = document.querySelectorAll("[id^=ename_]")
// 	// data-ename의 패턴을 이용해서 선택
// 	let enames = document.querySelectorAll("[data-ename^=ename_]")
	for(let i=0; i<enames.length; i++){
		enames[i].addEventListener("click", (event)=>{
			/* 클릭된 요소
			this = event.target
			event.target === this
			this : span
			this.parentNode : td
			*/
			event.target.parentNode.querySelector("form").submit();
		})
	}
})
//document.addEventListener("DOMContentLoaded")

</script>

	

</head>
<body>
<hr>
<a href="/proj23_mybatis/test03/empForm.jsp">회원가입</a>
<hr>
ename : ${ename }<br>
<hr>
<form method="get" action="dynamic">
	<select name="type">
<%-- 		<c:if test="${type == 1 }"> --%>
<!-- 			<option value="1" selected="selected">이름</option> -->
<%-- 		</c:if> --%>
<%-- 		<c:if test="${type != 1 }"> --%>
<!-- 			<option value="1">이름</option> -->
<%-- 		</c:if> --%>
		
<%-- 		<c:if test="${type eq 2 }"> --%>
<!-- 			<option value="2" selected="selected">연봉(이상)</option> -->
<%-- 		</c:if> --%>
<%-- 		<c:if test="${type ne 2 }"> --%>
<!-- 			<option value="2">연봉(이상)</option> -->
<%-- 		</c:if> --%>
		
<%-- 		<option value="2" <c:if test="${type eq 2 }"> selected="selected" </c:if>>연봉(이상)</option> --%>
		<%
			String selected = "";
			String type = (String) request.getAttribute("type");
			
			if("2".equals(type)){
				selected = " selected='selected'";
			}
		%>
<%-- 		<option value="2" <%=selected %>>연봉(이상)</option> --%>

		<option value="1" ${type == 1 ? "selected='selected'" : "" }>이름</option>
		<option value="2" ${type == 2 ? "selected='selected'" : "" }>연봉(이상)</option>
		<option value="3" ${type == 3 ? "selected='selected'" : "" }>연봉(이하)</option>
		<option value="4" ${type == 4 ? "selected='selected'" : "" }>직책</option>
		<option value="5" ${type == 5 ? "selected='selected'" : "" }>이름+직책</option>
	</select>
	<input type="text" name="keyword" value="${keyword }">
	<input type="submit" value="검색">
</form>
<table border=1>
	<thead>
		<tr>
			<th>empno</th>
			<th>ename</th>
			<th>sal</th>
			<th>job</th>
			<th>detpno</th>
		</tr>
	</thead>
	<tbody>
		<c:if test="${not empty list }">
			<c:forEach var="dto" items="${list }">
				<tr>
					<td>${dto.empno }</td>
					<td>
						<form method="post" action="/proj23_mybatis/param">
							<input type="hidden" name="action" value="actionDetail">
							<input type="hidden" name="empno" value="${dto.empno }">
						</form>
						<span class="ename" id="ename_${dto.empno }" data-ename="ename_${dto.empno }">${dto.ename }</span>
					</td>
					<td>${dto.sal }</td>
					<td>${dto.job }</td>
					<td>${dto.deptno }</td>
				</tr>
			</c:forEach>
		</c:if>
		<c:if test="${empty list }">
			<tr>
				<td colspan="3">조회할 내용이 없습니다</td>
			</tr>
		</c:if>
	</tbody>
</table>

</body>
</html>