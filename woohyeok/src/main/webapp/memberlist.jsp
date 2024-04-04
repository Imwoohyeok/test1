<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@  page import="model.*, java.util.List"%>
<%
	request.setCharacterEncoding("UTF-8"); // 한글 인코딩 설정
%>
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String phone = request.getParameter("phone");
	String hobby = request.getParameter("hobby");
	String job = request.getParameter("job");
	String age = request.getParameter("age");
	// 인스턴스 만들고 회원정보 속성에 설정
	MemberBean m = new MemberBean(id, pw, phone, hobby, job, age);
	MemberDAO dao = new MemberDAO();
	dao.insert(m); // 회원정보를 테이블에 추가
	List<MemberBean> membersList = dao.listMember(); // 전체정보 조회
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
	<h2>모든 회원보기</h2>
	
	<table border="1" align="center">
		<tr height="50">
			<td width="150" align="center">아이디</td>
			<td width="200" align="center">비밀번호</td>
			<td width="150" align="center">휴대폰번호</td>
			<td width="200" align="center">관심분야</td>
			<td width="100" align="center">직업</td>
			<td width="100" align="center">나이</td>
		</tr>
	<%
		if(membersList.size() == 0) {		
	%>	
		<tr>
			<td colspan="6">
				<p align="center">
					<b><span style="font-size:9pt">
						등록된 회원이 없습니다.
					</span></b>
				</p>
			</td>
		</tr>
	<% } else {
			for(int i=0; i< membersList.size(); i++) {
				MemberBean bean = (MemberBean)membersList.get(i);
	%>
			<tr align="center">
				<td><%= bean.getId() %></td>		
				<td><%= bean.getPw() %></td>		
				<td><%= bean.getPhone() %></td>		
				<td><%= bean.getHobby() %></td>		
				<td><%= bean.getJob() %></td>		
				<td><%= bean.getAge() %></td>		
			</tr>	
	
	<%
			} // for문 종료
		} // if문 종료
	%>
		<tr height="1" bgcolor="#99ccff">
			<td colspan="6"></td>
		</tr>
		
		
	</table>
</body>
</html>