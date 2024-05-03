<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table {
	margin: auto;
	width: 500px;
}

h1 {
	text-align: center;
}

td:nth-Child(1), td:nth-Child(2), td:nth-Child(3), td:nth-Child(5) {
	text-align: center;
}

tr:nth-Child(2N-1) {
	background-color: skyblue;
}
</style>
</head>
<body>

	<h1>emp 목록</h1>
	<hr>

	<table border=1>
		<thead>
			<tr style="background-color: #888;">
				<th>No.</th>
				<th>레벨</th>
				<th>사원번호</th>
				<th>이름</th>
				<th>상급자</th>
			</tr>
		</thead>
		<tbody>
			<c:if test="${not empty list }">
				<c:forEach var="vo" items="${list}" varStatus="status">
					<tr>
						<td>${vo.rnum}</td>
						<td>${vo.lv}</td>
						<td>${vo.empno}</td>
						<td style="padding-left : ${(vo.lv-1)*10}px;"><c:if
								test="${vo.lv != 1 }">ㄴ</c:if>${vo.ename}</td>
						<td>${vo.mgr}</td>
					</tr>
				</c:forEach>
			</c:if>
			<c:if test="${empty list}">
				<tr>
					<td colspan="5">자료가 없습니다.</td>
				</tr>
			</c:if>
		</tbody>
	</table>

	<!--  페이징paging -->
	<div style="text-align: center;">
		<%
		int totalCount = (int) request.getAttribute("totalCount");
		int countPerPage = (int) request.getAttribute("countPerPage");
		int pageNum = (int) request.getAttribute("pageNum"); // 현재 페이지
		int lastPage = (int) Math.ceil((double) totalCount / countPerPage);

		int countPerSection = 5; // 페이징 그룹 : 한번에 보여줄 페이지의 개수

		int sec_position = (int) Math.ceil((double) pageNum / countPerSection);
		// 2 : 4~6

		int sec_first = (sec_position - 1) * countPerSection + 1;
		int sec_last = sec_position * countPerSection;
		// 8 : 28~30 - 페이지는 28페이지까지만 있어야함
		if (sec_last > lastPage) {
			sec_last = lastPage; //현재페이지가 마지막페이지보다 크다면 그 페이지를 현재페이지가 되게 하겠다 뭐 그런건가봄
		}
		%>


		<!-- ceil은 올림처리 하는 것임, ceil이 보내주는 게 double라서 int로 형변환,  -->
		<!-- totalCountr과 countPerPage은 int라서 소숫점자리가 나올 수 없으니 141/10하면 14가 나옴  -->
		<!-- 따라서 double로 바꿔주어야지 제대로된 소순점이 나오고 그 다음에 ceil을 해줘야 올림처리를 해서 15가 나올 수 있음 -->

		<c:set var="lastPage2" value="<%=lastPage%>" />
		<c:set var="start" value="<%=sec_first%>" />
		<c:set var="end" value="<%=sec_last%>" />

		<c:if test="<%=sec_first != 1%>">
		[<a href="/proj17_paging/emp?pageNum=<%=sec_first - 1%>">이전</a>]
		</c:if>
		<c:if test="<%=sec_first == 1%>">
		[이전]
		</c:if>


		<c:forEach var="i" begin="${start}" end="${end}">
			<c:choose>
				<c:when test="${i != pageNum}">
					[<a href="/proj17_paging/emp?pageNum=${i}">${i}</a>]
				</c:when>
				<c:otherwise>
					[<a href="/proj17_paging/emp?pageNum=${i}"><strong>${i}</strong></a>]
				</c:otherwise>
			</c:choose>
		</c:forEach>


		<c:if test="<%=sec_last != lastPage%>">
		[<a href="/proj17_paging/emp?pageNum=<%=sec_last + 1%>">다음</a>]
		</c:if>
		<c:if test="<%=sec_last == lastPage%>">
		[다음]
		</c:if>

	</div>



</body>
</html>