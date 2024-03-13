package sec01.ex01;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String frmLogin = request.getParameter("frmLogin");
		System.out.println("frmLogin : " + frmLogin);
		String theme = request.getParameter("theme");
		System.out.println("theme : " + theme);

		// 하나만 보낸 경우
		String user_id = request.getParameter("user_id");
		System.out.println("user_id : " + user_id);
		String[] user_ids = request.getParameterValues("user_id");
		System.out.println("user_ids : " + user_ids.length);   // user_id의 개수
		
		// 여러개 보낸 경우
		String subject = request.getParameter("subject");
		System.out.println("subject : " + subject);
		String[] subjects = request.getParameterValues("subject");
		System.out.println("subjects : " + subjects.length);  // 체크된 개수
		
		response.getWriter().println("{\"k\":\"v\"}");	
	}

}
