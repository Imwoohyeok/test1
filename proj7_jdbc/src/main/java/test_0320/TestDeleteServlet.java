package test_0320;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import practice.ex01.PracticeDAO;

@WebServlet("/testdelete")
public class TestDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		TestDAO dao = new TestDAO();
		
		// num 파라미터 얻기
		int seq = Integer.parseInt(request.getParameter("seq"));
		
		String delete = request.getParameter("delete");
		
		// 첫 번째 파라미터로 얻은 num 삭제
		dao.delete(seq);
		
		// 경로 이동
		response.sendRedirect("/proj7_jdbc/test");
	}

}
