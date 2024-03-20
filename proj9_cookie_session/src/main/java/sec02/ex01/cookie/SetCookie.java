package sec02.ex01.cookie;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/set")
public class SetCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Cookie 객체 생성
		Cookie c = new Cookie("key", "value");
		// setMaxAge를 설정하지 않거나
		// 음수를 넣으면
		// 세션쿠키가 된다
		// 즉, 브라우저 메모리에만 저장된다
		// 즉2, 브라우저의 모든 탭을 끄면 사라진다
		c.setMaxAge(10); // 초단위  10초뒤에 사라짐
		response.addCookie(c);  // 생성된 쿠키를 브라우저로 전송
		
		String han = "한글";
		URLEncoder.encode(han, "utf-8");
		System.out.println("인코딩된 han : " + han);
		
		// Cookie2 객체 생성
		Cookie c2 = new Cookie("key2", "value");
		c2.setMaxAge(10); 
		response.addCookie(c2);  
		
		System.out.println("쿠키 세팅 완료");
	}

	

}
