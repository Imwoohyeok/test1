package sec01.ex01;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login2")
public class Login2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		// id 받아서 출력
		String id = "";
		id = request.getParameter("id");
		System.out.println("id : " + id);
		
		// valid
		// validate
		if(id == null || "".equals(id)) {
			response.getWriter().println("아이디는 필수입니다.");
			return;
		}
		// pw 받아서 출력
		String pw = "";
		pw = request.getParameter("pw");
		System.out.println("pw : " + pw);
		
		String str = "당신의 아이디는 :" + id + "입니다<br>";
		String str2 = "당신의 비번은 :" + pw + "입니다";
		response.getWriter().println(str);
		response.getWriter().println(str2);
	}

}
