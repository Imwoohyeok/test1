

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jsp")
public class JspServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// HTTP 요청에서 "id" 파라미터의 값을 가져옴
		String id = request.getParameter("id");
		
//		response.sendRedirect("param.jsp?id=" + id);
		
//		request.getRequestDispatcher("param.jsp?id=" + id).forward(request,response);
		// 어차피 request를 전달하고 jsp는 거기서 id값을 꺼낼 수 있다
		// foward로 생명 연장됨?
//		request.getRequestDispatcher("param.jsp").forward(request,response);
		
		
		// 가져온 "id" 값을 "id2"라는 이름으로 request 속성에 설정합니다.
		request.setAttribute("id2", id); 
		
		List<String> list = new ArrayList<String>();
		list.add("임");
		list.add("우");
		list.add("혁");
		request.setAttribute("list", list);
		
		
		// "param.jsp"로 요청을 전달하면서 현재의 request 및 response 객체를 유지합니다.
        // 이후 "param.jsp"에서는 이러한 속성들을 사용할 수 있습니다.
		request.getRequestDispatcher("param.jsp").forward(request,response);
		
		
		
	}

}
