package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {
	
	// Connection을 이용한 DB 연동 메소드 작성
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@112.148.46.134:51521:xe";
	private String user = "scott4_13";
	private String password = "tiger";
	
	
	public Connection connDB() {
		Connection con = null;
		
		System.out.println("connDB 실행");
		try {
			System.out.println("con : " + con);
			// 오라클 드라이버 로딩
			Class.forName(driver);
			
			// DB 접속
			con = DriverManager.getConnection(this.url, this.user, this.password);
			System.out.println("conDB 실행완료");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	public List<MemberBean> listMember() {
		Connection con = null;
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		List<MemberBean> list = new ArrayList<>();
		
		try {
			con = connDB(); // connDB() 메소드를 호출하여 con 필드 초기화
			
			// SQL 준비
			String query = "select * from member";
			
			ps = con.prepareStatement(query);
			
			// SQL 실행 및 결과 확보
			rs = ps.executeQuery();
			
			// 결과활용
			while(rs.next()) {
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String phone = rs.getString("phone");
				String hobby = rs.getString("hobby");
				String job = rs.getString("job");
				String age = rs.getString("age");

				System.out.println("id : "+ id);
				
				MemberBean vo = new MemberBean();
				vo.setId(id);
				vo.setPw(pw);
				vo.setPhone(phone);
				vo.setHobby(hobby);
				vo.setJob(job);
				vo.setAge(age);
				
				list.add(vo);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
		
		}
		return list;
	}
	
	// insert 메소드
	public void insert(MemberBean dto) {
		Connection con = null;
		
		PreparedStatement ps = null;
				
		try {  //sql문
			con = connDB();
			
			String sql = "insert into member values(?,?,?,?,?,?)";
			ps = con.prepareStatement(sql);
			
			// SQL 실행 및 결과 확보
			
			// geter를 이용해 회원정보를 가져옴
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getPw());
			ps.setString(3, dto.getPhone());
			ps.setString(4, dto.getHobby());
			ps.setString(5, dto.getJob());
			ps.setString(6, dto.getAge());
			ps.executeUpdate();
			
			// SQL 실행
	        ps.executeUpdate();
			
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
	        if (ps != null) {
	            try {
	                ps.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	}
}
