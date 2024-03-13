package sec02.ex01.dbcp;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sec01.ex01.jdbc.part.EmpDTO;

@WebServlet("/dbcp")
public class DbcpServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8;");

		// 데이터베이스 연동을 위한 DAO 객체 생성
		DbcpDAO dbcpDAO = new DbcpDAO();

		// 요청 파라미터 중 command 값 받아오기
		String command = request.getParameter("command");
		if (command == null) { // command가 null인 경우
			List list = dbcpDAO.listEmp();  // 사원 목록을 가져오는 메서드 호출

			System.out.println("총 개수 : " + list.size()); //총 사원 수 출력

			 // 각 사원 정보를 HTML로 출력
			for (int i = 0; i < list.size(); i++) {
				EmpDTO empDTO = (EmpDTO) list.get(i);
				int empno = empDTO.getEmpno();
				String ename = empDTO.getEname();
				int sal = empDTO.getSal();

				response.getWriter()
						.println("<div>empno : " + empno + ", ename : <a href='dbcp?command=detail&empno=" + empno
								+ "'>" + ename + "</a>, sal : " + sal
								+ "<button type='button'><a href='dbcp?command=delete&empno=" + empno
								+ "'>삭제</a></button></div>");
			}
			return;
		} else if ("insert".equals(command)) { // command가 insert인 경우
			// 요청 파라미터로부터 사원 정보 받아오기
			String empnoStr = request.getParameter("empno");
			int empno = Integer.parseInt(empnoStr);
			String ename = request.getParameter("ename");
			String salStr = request.getParameter("sal");
			int sal = Integer.parseInt(salStr);
			String deptnoStr = request.getParameter("deptno");
			int deptno = Integer.parseInt(deptnoStr);

			EmpDTO empDTO = new EmpDTO(); // EmpDTO 객체 생성 및 설정
			empDTO.setEmpno(empno);
			empDTO.setEname(ename);
			empDTO.setSal(sal);
			empDTO.setDeptno(deptno);

//			int result = dbcpDAO.insertEmp2(empnoStr, ename, salStr, deptnoStr);
			// 사원 추가 메서드 호출 및 결과 출력
			int result = dbcpDAO.insertEmp2(empDTO);
			System.out.println("insert 결과 : " + result);

			// list 페이지로 이동
			response.sendRedirect("dbcp");

		} else if ("detail".equals(command)) { // command가 detail인 경우
			// 요청 파라미터로부터 사원 번호 받아오기
			String strEmpno = request.getParameter("empno");
			int empno = Integer.parseInt(strEmpno);

			// 사원 상세 정보 조회 메서드 호출
			List list = dbcpDAO.listEmp(empno);
			if (list.size() == 0) {  // 조회된 사원이 없는 경우
				response.getWriter().println("<div>조회된 사원이 없습니다</div>");
			} else { // 조회된 사원이 있는 경우
				// 수정 폼 출력
				EmpDTO dto = (EmpDTO) list.get(0);
				response.getWriter().println("<form method='get' action='dbcp'>");
				response.getWriter().println("    <div>empno  : " + dto.getEmpno() + "'</div>");
				response.getWriter().println(
						"    <div>ename  : <input type='text' name='ename' value='" + dto.getEname() + "'></div>");
				response.getWriter()
						.println("    <div>job    : <input type='text' name='job' value='" + dto.getJob() + "'></div>");
				response.getWriter()
						.println("    <div>sal    : <input type='text' name='sal' value='" + dto.getSal() + "'></div>");
				response.getWriter().println(
						"    <div>deptno : <input type='text' name='deptno' value='" + dto.getDeptno() + "'></div>");
				response.getWriter().println("    <input type='hidden' name='empno' value='" + dto.getEmpno() + "'>");
				response.getWriter().println("    <input type='hidden' name='command' value='modify'>");
				response.getWriter().println("    <input type='submit' value='수정'>");
				response.getWriter().println("    <a href='dbcp'><button type='button'>취소</button></a>");
				response.getWriter().println("</form>");
			}

		} else if ("modify".equals(command)) { // command가 modify인 경우
			// 요청 파라미터로부터 수정할 사원 정보 받아오기
			String empnoStr = request.getParameter("empno");
			int empno = Integer.parseInt(empnoStr);
			String ename = request.getParameter("ename");
			String salStr = request.getParameter("sal");
			int sal = Integer.parseInt(salStr);
			String job = request.getParameter("job");

			EmpDTO empDTO = new EmpDTO(); // EmpDTO 객체 생성 및 설정
			empDTO.setEmpno(empno);
			empDTO.setEname(ename);
			empDTO.setSal(sal);
			empDTO.setJob(job);

			// 사원 수정 메서드 호출 및 결과 출력
			int result = dbcpDAO.updateEmp2(empDTO);
			System.out.println("update 결과 : " + result);

			// list 페이지로 이동
			response.sendRedirect("dbcp");
		} else if ("delete".equals(command)) { // command가 delete인 경우
			// 요청 파라미터로부터 삭제할 사원 번호 받아오기
			String strEmpno = request.getParameter("empno");
			int empno = Integer.parseInt(strEmpno);

			// 사원 삭제 메서드 호출 및 결과 출력
			int result = dbcpDAO.deleteEmp2(empno);
			System.out.println("삭제 결과 : " + result);
			// list 페이지로 이동
			response.sendRedirect("dbcp");

		}

	}

}
