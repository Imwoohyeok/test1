package woo;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 * Servlet implementation class Upload
 */
@WebServlet("/upload")
public class Upload extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 한글깨짐방지
		String encoding = "utf-8";
		request.setCharacterEncoding(encoding);
		
		// LoadDTO 인스턴스 생성
		LoadDTO dto = new LoadDTO();
		
//		String id = request.getParameter("id");
//		String pw = request.getParameter("pw");

//		dto.setId(id);
//		dto.setPw(pw);
		
		String fileName = null;
				
		try {
			// 파일 저장 디렉토리 설정
			// File ; 파일 또는 디렉토리(폴더)를 관리하는 class
			File currentDirPath = new File("C:\\fff");

			// 파일 업로드를 위한 설정
			// 세팅
			DiskFileItemFactory factory = new DiskFileItemFactory();
			factory.setRepository(currentDirPath); // 임시 파일 저장소 설정

			// 8bit = 1바이트Byte
			// 1024bit = 1KB
			// 1024KB = 1MB
			// 1024MB = 1GB
			// 1024GB = 1TB

			// 처리하는 메모리 용량
			factory.setSizeThreshold(1024 * 1024); // 메모리에 저장할 최대 사이즈 지정

			ServletFileUpload upload = new ServletFileUpload(factory);
			// 파일의 최대 크기 지정
			upload.setFileSizeMax(1024 * 1024 * 100); // 업로드할 파일의 최대 크기 지정

			// HTTP 요청을 파싱하여 파일 업로드를 수행
			// request를 분석하라
			List items = upload.parseRequest(request);

			for (int i = 0; i < items.size(); i++) {
				FileItem fileItem = (FileItem) items.get(i);

				if (fileItem.isFormField()) {
					// 파일이 아닌 일반 form 데이터 처리
					// form 요소인지 판별
					if(fileItem.getFieldName().equals("id")) {
						String id = fileItem.getString(encoding);
						dto.setId(id);
						System.out.println(fileItem.getFieldName() + "=" + fileItem.getString(encoding));
					} else {
						String pw = fileItem.getString(encoding);
						dto.setPw(pw);
						System.out.println(fileItem.getFieldName() + "=" + fileItem.getString(encoding));
					}
					// 기존처럼 사용 가능
//							String param1 = request.getParameter("param1");
				} else {
					// 파일 처리 영역
					// file 영역
					System.out.println("param:" + fileItem.getFieldName());
					System.out.println("file name:" + fileItem.getName());
					System.out.println("file size:" + fileItem.getSize() + "Bytes");

//					System.out.println(fileItem.getName());
					if (fileItem.getSize() > 0) {
						// 파일명 추출 및 중복 방지를 위한 처리
						// 아이디어 1 : 파일명을 추출하는
						int idx = fileItem.getName().lastIndexOf("\\");
						System.out.println("idx : 1 : " + idx);
						if (idx == -1) {
							idx = fileItem.getName().lastIndexOf("/");
						}
						System.out.println("idx : 2 : " + idx);
						fileName = fileItem.getName().substring(idx + 1);

						// dto에 파일명 담음
						dto.setImg_filename(fileItem.getName());
						
						// 아이디어 2 : 파일명 중복 방지
						long timestamp = System.currentTimeMillis();
						fileName = timestamp + "_" + fileName;

						// 파일 저장 경로 설정 후 저장
						File uploadFile = new File(currentDirPath + "\\" + fileName);
//								File uploadFile = new File(currentDirPath + File.separator + fileName);
//								File uploadFile = new File(currentDirPath + System.getProperty("file.separator") + fileName);
						fileItem.write(uploadFile);
						
					} // end if
				} // end if
			} // end for
			

			request.setAttribute("id", dto.getId());
			request.setAttribute("pw", dto.getPw());
			request.setAttribute("img_filename", dto.getImg_filename());
			
			try (Connection conn = new DatabaseConnection().getConnection()) {
				String sql = "INSERT INTO login (id, pw, img_filename) VALUES (?, ?, ?)";
				try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
					pstmt.setString(1, dto.getId());
					pstmt.setString(2, dto.getPw());
					pstmt.setString(3, dto.getImg_filename());
					pstmt.executeUpdate();
				}
			}
			// 위쪽 for문 안에서 DTO(VO)를 완성하고
			// DB에 저장할 수 있겠다

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		request.getRequestDispatcher("login.jsp").forward(request, response);

	}
	
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//	}
	
	public class DatabaseConnection {

	    public Connection getConnection() throws SQLException {
	        String url = "jdbc:oracle:thin:@112.148.46.134:51521:xe";
	        String username = "scott4_13";
	        String password = "tiger";

	        try {
	            // JDBC 드라이버를 로드
	            Class.forName("oracle.jdbc.driver.OracleDriver");
	        } catch (ClassNotFoundException e) {
	            throw new SQLException("Oracle JDBC Driver not found.", e);
	        }

	        // DriverManager를 사용하여 Connection을 가져옴
	        return DriverManager.getConnection(url, username, password);
	    }
	}
	
}


