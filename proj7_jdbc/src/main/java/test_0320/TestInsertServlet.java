package test_0320;

import java.io.IOException;
import java.util.List;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/testinsert")
public class TestInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8;");
		
		TestDAO dao = new TestDAO();
		
//		String strSeq = request.getParameter("seq");
//		int seq = Integer.parseInt(strSeq);
//		System.out.println("seq : " + seq);
		
		String strNum = request.getParameter("num");
		int num = Integer.parseInt(strNum);
		System.out.println("num : " + num);
		
		String amount = request.getParameter("amount");
		System.out.println("amount" + amount);
		
		String strMenu = request.getParameter("menu");
		int menu = Integer.parseInt(strMenu);
		System.out.println("menu : " + menu);
		
		String strTarget = request.getParameter("target");
		int target = Integer.parseInt(strTarget);
		System.out.println("target : " + target);
		
		
		dao.add(num, amount, menu, target);
		
		// 경로 이동
		response.sendRedirect("/proj7_jdbc/test");
		
	}

}
