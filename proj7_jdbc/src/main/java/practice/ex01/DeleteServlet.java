	package practice.ex01;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PracticeDAO dao = new PracticeDAO();
		
		// empno 파라미터 얻기
		int empno = Integer.parseInt(request.getParameter("empno"));
		
		String delete = request.getParameter("delete");
		
		// 첫 번째 파라미터로 얻은 empno 삭제
		dao.delete(empno);
		
		// 경로 이동
		response.sendRedirect("/proj7_jdbc/practice");
		
		
	}

}
