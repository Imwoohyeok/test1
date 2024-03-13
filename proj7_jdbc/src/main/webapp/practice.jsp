<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="sec01.ex01.jdbc.part.EmpDTO"%>
 <%@ page import="practice.ex01.PracticeDAO"%>
 <%@ page import="practice.ex01.PracticeServlet"%>
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
<script>
	
</script>
<body>

<form name="pra" method="get" action="insert">
	<table>
	<thead>
		<tr>
			<td>EMPNO</td>
			<td>ENAME</td>
			<td>JOB</td>
			<td>MGR</td>
			<td>HIREDATE</td>
			<td>SAL</td>
			<td>COMM</td>
			<td>DEPTNO</td>
		</tr>
	</thead>
	<tbody>
            <%
                PracticeDAO practiceDAO = new PracticeDAO();
         		// 직원 목록을 가져오기
                List<EmpDTO> list = practiceDAO.listEmp();
                
                for (int i = 0; i < list.size(); i++) {
                	// 각 직원 정보를 가져오기
                	EmpDTO empDTO = list.get(i);
            %>
            <tr>
                <td><%= empDTO.getEmpno() %></td>
                <td><%= empDTO.getEname() %></td>
                <td><%= empDTO.getJob() %></td>
                <td><%= empDTO.getMgr() %></td>
                <td><%= empDTO.getHiredate() %></td>
                <td><%= empDTO.getSal() %></td>
                <td><%= empDTO.getComm() %></td>
                <td><%= empDTO.getDeptno() %></td>
                <td><a href ="delete?empno=<%= empDTO.getEmpno() %>">삭제</a></td>
            </tr>
            <% } %>
        </tbody>
		
	</table>
	<br>
	<table>
		<tr>
			<td>EMPNO</td>
			<td>ENAME</td>
			<td>JOB</td>
			<td>MGR</td>
			<td>HIREDATE</td>
			<td>SAL</td>
			<td>COMM</td>
			<td>DEPTNO</td>
		</tr>
		<tr>
			<td><input type="text" name="empno"></td>
			<td><input type="text" name="ename"></td>
			<td><input type="text" name="job"></td>
			<td><input type="text" name="mgr"></td>
			<td><input type="text" name="hiredate"></td>
			<td><input type="text" name="sal"></td>
			<td><input type="text" name="comm"></td>
			<td><input type="text" name="deptno"></td>
		</tr>
	</table>
	<br>
	<input type="submit" value="추가">
    <input type="button" name="update" value="수정">
	
</form>

<form method="get" action="delete">

	<input type="text" name="empno">
	
	<input type="submit" name="delete" value="삭제">
</form>


</body>
</html>