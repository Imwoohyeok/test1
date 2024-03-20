package test_0320;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8;");
		
		TestDAO testDAO = new TestDAO();
		List list = testDAO.listEmp();
		
		System.out.println("list : " + list);
		
		for(int i=0; i<list.size(); i++) {
			TestDTO testDTO = (TestDTO) list.get(i);
			int seq = testDTO.getSeq();
			int num = testDTO.getNum();
			String amount = testDTO.getAmount();
			int menu = testDTO.getMenu();
			int target = testDTO.getTarget();
			
			
			response.getWriter().println("<div>num : " + num + ", amount : " + amount + ", menu : " + menu + ", target : " + target + "</div>");
		}
		
	}

}
