package sec01.ex01.send;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/first/next")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/first doGet");
		response.getWriter().println("/first doGet");
		
//		response.sendRedirect("second");
//		response.sendRedirect("/proj8_forward/second");
		
//		response.sendRedirect(request.getContextPath()); // proj8_forward
		response.sendRedirect(request.getContextPath() + "/second");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/first doPost");
		response.getWriter().println("first doPost");
	
	}

}
