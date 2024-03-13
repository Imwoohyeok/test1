package practice.ex01;

import java.io.IOException;
import java.sql.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sec01.ex01.jdbc.part.EmpDTO;
import sec02.ex01.dbcp.DbcpDAO;

@WebServlet("/practice")
public class PracticeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8;");
		
		PracticeDAO practiceDAO = new PracticeDAO();
		List list = practiceDAO.listEmp();
		
		for(int i=0; i<list.size(); i++) {
			EmpDTO empDTO = (EmpDTO) list.get(i);
			int empno = empDTO.getEmpno();
			String ename = empDTO.getEname();
			String job = empDTO.getJob();
			int mgr = empDTO.getMgr();
			Date hiredate = empDTO.getHiredate();
			int sal = empDTO.getSal();
			int comm = empDTO.getSal();
			int deptno = empDTO.getDeptno();
			
			
			response.getWriter().println("<div>empno : " + empno + ", ename: <a href='practice.jsp?empno=" + empno + "'>"
				    + ename + "</a>, sal : " + sal + "</div>");
		}
		
		
	}


}
