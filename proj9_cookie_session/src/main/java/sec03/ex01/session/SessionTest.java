package sec03.ex01.session;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sessiontest")
public class SessionTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	List list = new ArrayList();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 기존 세션이 없으면 null을 return
		HttpSession session2 = request.getSession(false);
		
		// 기존 세션이 없으면 새로만들어서 return
		HttpSession session1 = request.getSession();
		
		System.out.println("session2 : " + session2);
		
		System.out.println("session1 : " + session1);
		System.out.println("session1.isNew() : " + session1.isNew());
		// String 타입을 반환
		System.out.println("session1.getId() : " + session1.getId());
		// 세션 유지시간을 초로 반환 (기본값 1800초) 30분
		System.out.println("session1.getMaxInactiveInterval() : " + session1.getMaxInactiveInterval());
		System.out.println("session1.getLastAccessedTime() : " + session1.getLastAccessedTime());
		// 11시 47분쯤
		
		String old_id = (String)session1.getAttribute("id");
		System.out.println("old_id : " + old_id);
		
		String id = "abcd";
		session1.setAttribute("id", id);
		
		
//		session1.setAttribute("마지막유효시간", "오후 12시 29분 14초");
//		String id = request.getParameter("id");
		
//		// DB에서 로그인 체크
//		session1.setAttribute("id", id);
//		if(session1.isNew()) {
//			list.add(session1);
//		}
//		
//		// 중복 로그인을 제거할 수 있다
//		// for
//		HttpSession session = (HttpSession)list.get(0);
//		String olg_id = (String)session.getAttribute("id"); 
		
		String url = response.encodeURL("session");
		System.out.println("url : " + url);
		response.getWriter().println("<a href='"+ url + "'>session으로 이동</a>");
	}

}
