package bank;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/bank")
public class BankServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// 필드
//	int balance = 0;
	// print() 로 필드 balance 확인
	// 필드에 놔야지 누적
	// 클래스가 없어질 때 까지 살아있음
	int print = 0;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 한글깨짐 방지
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8;");
		
		System.out.println("doget 실행");
		response.getWriter().println("입금bank 실행" + "<br>");
		
		// name이 값 가져오기
//		String type = request.getParameter("type");
//		String str_in = request.getParameter("in");
//		String str_out = request.getParameter("out");
//		
//		System.out.println("type : " + type);
//		System.out.println("str_in : " + str_in); // 입금값
//		System.out.println("str_out : " + str_out); // null
//		
//		
//		
//		if(type != null) { // type 이 null 이 아닐 때 
//			if("1".equals(type)) {  // type 이 1일 때
//				int mo_in = Integer.parseInt(str_in);
//				balance = balance + mo_in;
//			} else if("2".equals(type)) { // type 이 2일 때
//				int mo_out = Integer.parseInt(str_out);
//				balance = balance - mo_out;
//			}
//		}
//		
//		System.out.println("-------------------------");
		
		String type = request.getParameter("type");
		int in = Integer.parseInt(request.getParameter("in"));
		
		System.out.println("in : " + in + "원 입금됨");
		
		response.getWriter().println( in + "원 입금되었습니다" + "<br>" );
		
		// BankDAO 인스턴스 생성
		BankDAO dao = new BankDAO();
		
		
		print += dao.print(in);
		
		response.getWriter().println("잔고 : " + print + "원");
		
		System.out.println("-------------------------");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8;");
		
		System.out.println("doPost 실행");
		response.getWriter().println("출금bank 실행" + "<br>");
		
		// input값 가져오기
		int out = Integer.parseInt(request.getParameter("out"));
		
		System.out.println("out : " + out + "원 출금됨");
		
		response.getWriter().println( out + "원 출금되었습니다" + "<br>");
		
		// BankDAO 인스턴스 생성
		BankDAO dao = new BankDAO();
		
		
		
		// print() 로 필드 balance 확인
		print -= dao.print(out);
		
		response.getWriter().println("잔고 : " + print + "원");
		
		
	}

}
