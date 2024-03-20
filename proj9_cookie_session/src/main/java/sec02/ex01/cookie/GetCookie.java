package sec02.ex01.cookie;

import java.io.IOException;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/get")
public class GetCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8;");
		
		// 쿠키 정보요청한 후 
		// 쿠키 정보를 배열로 가져옴 
		Cookie[] cookies = request.getCookies();
		System.out.println(cookies);
		
		// nullpointerExcep에러 뜨기 때문에 set 하고 get 해야함
		// cookies 가 null 이 될 수 있기 때문에 if문으로 방어코딩
		if(cookies != null) {
			for(int i = 0; i< cookies.length; i++) {
				Cookie c = cookies[i];
				
				System.out.println("쿠키 이름 : " + c.getName());
				System.out.println("쿠키 값 : " + c.getValue());
				
				String name = c.getName();
				if("key".equals(name)) {
					response.getWriter().println("key로 저장된 쿠키의 값 : " + c.getValue());
				}
				
				if("key2".equals(name)) {
					String han = URLDecoder.decode(c.getValue());
					System.out.println("디코딩된 han : " + han);
					response.getWriter().println("key2로 저장된 쿠키의 값 : " + han);	
				}
			}
			
		}
		
		// key 이름을 가진 쿠키가 있었는지 없었는지 출력?
		
		// 쿠키 중에
		// 이름이 "key2" 인게 있었으면 안 보여주고
		// 없었으면 보여줌
		if(cookies != null) {
			response.getWriter().println("<div style='border:1px solid red;'>팝업표시</div>");			
		} else {
			response.getWriter().println("<div style='border:1px solid red; display:none'>팝업표시</div>");			
		}
		
	}

}
