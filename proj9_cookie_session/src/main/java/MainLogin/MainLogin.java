package MainLogin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/mainlogin")
public class MainLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	String id = "aaa";
	String pw = "1234";

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8;");
				
		request.getRequestDispatcher("login.html").forward(request,response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// input 아이디,비번 값 가져오기
		String user_id = request.getParameter("id");
		String user_pw = request.getParameter("pw");
					
		// 아이디값,비밀번호값이 맞을 때 
		if(id.equals(user_id) && pw.equals(user_pw)) {
			// 세션 생성
			// 로그인 됐을 때 세션 저장
			HttpSession session = request.getSession();
			// ★★★★★
			// setAttribute("속성", 값)
			session.setAttribute("login",session);
			response.sendRedirect("main.jsp");
		} else { // 값이 틀릴 때
			System.out.println("세션 생성실패");
		}

	}
	
}
