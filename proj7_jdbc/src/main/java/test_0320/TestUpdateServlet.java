package test_0320;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/testupdate")
public class TestUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8;");
		
		TestDAO dao = new TestDAO();
		System.out.println("들어옴?");

		int seq = Integer.parseInt(request.getParameter("seq1"));
		System.out.println("seq : " + seq);
		System.out.println(request.getParameter("num1"));
		
		
		int num = Integer.parseInt(request.getParameter("num1"));
		System.out.println("num : "+num);
		
		String amount = request.getParameter("amount1");
		System.out.println("amount : "+amount);
		
		int menu = Integer.parseInt(request.getParameter("menu1"));
		System.out.println("menu : "+menu);
		
		int target = Integer.parseInt(request.getParameter("target1"));
		System.out.println("target : "+target);
	    
	    // DAO를 통해 DB에 업데이트를 수행합니다.
	    dao.update(seq, num, amount, menu, target);

		response.sendRedirect("/proj7_jdbc/test");
	
	}

}
