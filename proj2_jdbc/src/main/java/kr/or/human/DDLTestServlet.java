package kr.or.human;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//JdbcServlet 클래스 
//JDBC를 사용하여 Oracle 데이터베이스에 연결하고 쿼리를 실행하는 서블릿
@WebServlet("/init")
public class DDLTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// HTTP GET 요청 처리 메서드
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 // 컨트롤러 메서드 호출
		controller(request, response);
	}

	// HTTP POST 요청 처리 메서드
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 컨트롤러 메서드 호출
		controller(request, response);
	}
	
	// controller 메서드: 요청에 대한 처리를 담당하는 메서드
	protected void controller(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		try {
			// 한글 깨짐 방지
			request.setCharacterEncoding("UTF-8");
			response.setContentType("text/html; charset=utf-8;");
			
		} catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		// Oracle 데이터베이스 연결을 위한 정보 설정
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@112.148.46.134:51521:xe";
		String user = "scott4_13";
		String password = "tiger";
		
		try {
			
			// JDBC 드라이버 로딩
			// Class.forName : String 변수로 class 생성
			Class clazz = Class.forName(driver);
			System.out.println("Oracle 드라이버 로딩 성공");
			
			// DB 접속
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("Connection 생성 성공");
			
//			String name = "SCOTT";
//			String name = "S";
//			String name = "s";
			// 요청 파라미터에서 이름 정보 추출
			String name = request.getParameter("name");
			
			// SQL 쿼리 작성
			String query = "";
			query += " create table emp2";
			query += " as select * from emp";
			System.out.println("query : " + query);
			
			// SQL 실행 준비
			PreparedStatement ps = con.prepareStatement(query);
			
			// SQL 실행, 결과를 ResultSet에 결과 확보
			int result = ps.executeUpdate();
			System.out.println("create table result : " + result);
			
			// 리소스 정리
			ps.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
