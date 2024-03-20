package test_0320;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

//import sec01.ex01.jdbc.part.EmpDTO;

public class TestDAO {
	
	private Connection con;

	private void connDB() {
		
		try {
            Context ctx = new InitialContext();
            DataSource dataFactory = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
            this.con = dataFactory.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	
	public List<TestDTO> listEmp() {
        connDB();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        List<TestDTO> list = new ArrayList<>();
		
		try {
			// SQL 준비
			String query = "select * from work1";
			
			ps = con.prepareStatement(query);
			
			// SQL 실행 및 결과 확보
			rs = ps.executeQuery();
			
			// 결과활용
			while(rs.next()) {
				int seq = rs.getInt("seq");
				int num = rs.getInt("num");
                String amount = rs.getString("amount"); // String으로 값을 가져옵니다.
                int menu = rs.getInt("menu");
                int target = rs.getInt("target");

                TestDTO testDTO = new TestDTO();
                testDTO.setSeq(seq);
                testDTO.setNum(num);
                testDTO.setAmount(amount);
                testDTO.setMenu(menu);
                testDTO.setTarget(target);
                
                list.add(testDTO);
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("드라이버 로딩 실패!");
		} finally {
			 // Connection, PreparedStatement, ResultSet을 닫습니다.
            try {
                if (con != null) con.close();
                if (ps != null) ps.close();
                if (rs != null) rs.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return list;
		
	}
	
	// insert 하는 메소드
	void add(int num, String amount, int menu, int target) {
		
		/* 꼭 써야함 !! */
		connDB();
		
		PreparedStatement ps = null;
				
		try {
				
			String query = "insert into work1 (seq, num, amount, menu, target) values(seq.nextval,?,?,?,?)";
			System.out.println("정상");
			// 테이블명 뒤에 컬럼 목록을 명시합니다.
				
			ps = con.prepareStatement(query);
				
			// insert문에 각 ? 에 순서대로 회원정보 세팅
			ps.setInt(1,num);
			ps.setString(2, amount);
			ps.setInt(3, menu);
			ps.setInt(4, target);
				
			// 회원정보를 테이블에 추가
			int add = ps.executeUpdate();
			
			System.out.println("add : " + add);
			System.out.println("ps : " + query);
				
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("insert 실패");
		} finally {
            try {
                if (con != null) con.close();
                if (ps != null) ps.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
			
	}
	
	
	// delete 하는 메소드
	void delete(int seq) {
		connDB();
			
		try {
				
			String query = "delete from work1";
			query += " where seq = ?";
				
			System.out.println("정상");
				
			PreparedStatement ps = con.prepareStatement(query);
				
			// insert문에 각 ? 에 순서대로 회원정보 세팅
			ps.setInt(1,seq);
			
			// 회원정보를 테이블에 추가
			int delete = ps.executeUpdate();
			if(delete > 0) {
				System.out.println("삭제 성공");
			} 
				
				
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("delete 실패");
		}
			
	}


	void update(int seq, int num, String amount, int menu, int target) {
		connDB();
		
		PreparedStatement ps = null;
			
		try {
			
			String query = "update work1";
			query += " set num=?, amount=?, menu=?, target=? where seq=?";
			
			System.out.println("정상");
			
			ps = con.prepareStatement(query);
			
			// insert문에 각 ? 에 순서대로 회원정보 세팅
			ps.setInt(1, num);
			ps.setString(2, amount);
			ps.setInt(3, menu);
			ps.setInt(4, target);
			ps.setInt(5, seq);
			
			// 회원정보를 테이블에 추가
			int update = ps.executeUpdate();
			
			System.out.println("update : " + update);
			
			System.out.println("ps : " + query);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("update 실패");
		} finally {
	        // 리소스를 해제합니다.
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
