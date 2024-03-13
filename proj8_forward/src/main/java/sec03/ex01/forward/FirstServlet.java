package sec03.ex01.forward;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "FirstServlet2", urlPatterns = { "/forward/first" })
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/forward first doGet");
		response.getWriter().println("/forward first doGet");
		
//		RequestDispatcher dispatch = request.getRequestDispatcher("second");
//		dispatch.forward(request, response);
		
		request.getRequestDispatcher("/forward/second").forward(request, response);
//		request.getRequestDispatcher("second").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/forward first doPost");
		response.getWriter().println("/forward first doPost");
	}

}
