package practice.ex01;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import sec01.ex01.jdbc.part.EmpDTO;

public class PracticeDAO {
private Connection con;
	
	private void connDB() {
		
		try {
			Context ctx = new InitialContext();
			DataSource dataFactory = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			this.con =  dataFactory.getConnection();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List listEmp() {
		
		long begin = System.currentTimeMillis();
		
		/* 꼭 써야함 !! */
		connDB();
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		List list = new ArrayList();
		
		try {
			// SQL 준비
			String query = "select * from emp2";
			
			ps = con.prepareStatement(query);
			
			// SQL 실행 및 결과 확보
			rs = ps.executeQuery();
			
			// 결과활용
			while(rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int mgr = rs.getInt("mgr");
				Date hiredate = rs.getDate("hiredate");
				int sal = rs.getInt("sal");
				int comm = rs.getInt("comm");
				int deptno = rs.getInt("deptno");

				System.out.println("empno : "+ empno);
				
				EmpDTO empDTO = new EmpDTO();
				empDTO.setEmpno(empno);
				empDTO.setEname(ename);
				empDTO.setJob(job);
				empDTO.setHiredate(hiredate);
				empDTO.setSal(sal);
				empDTO.setComm(comm);
				empDTO.setDeptno(deptno);
				
				list.add(empDTO);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(this.con != null) {
				try {
					this.con.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		
		}
		long end = System.currentTimeMillis();
		System.out.println("걸린시간 : " + (end-begin));
		
		return list;
		
	}
	
	
	// insert 하는 메소드
	void add(int empno, String ename, String job, int mgr, Date hiredate, int sal, int comm, int deptno) {
		long begin = System.currentTimeMillis();
		
		/* 꼭 써야함 !! */
		connDB();
		
		PreparedStatement ps = null;
			
		try {
			
			String query = "insert into emp2";
			query += " (empno, ename, job, mgr, hiredate, sal, comm, deptno)";
			query += " values(?,?,?,?,?,?,?,?)";
			
			System.out.println("정상");
			
			ps = con.prepareStatement(query);
			
			// insert문에 각 ? 에 순서대로 회원정보 세팅
			ps.setInt(1,empno);
			ps.setString(2, ename);
			ps.setString(3, job);
			ps.setInt(4, mgr);
			ps.setDate(5, hiredate);
			ps.setInt(6, sal);
			ps.setInt(7, comm);
			ps.setInt(8, deptno);
			
			// 회원정보를 테이블에 추가
			int add = ps.executeUpdate();
			System.out.println("add : " + add);
			
			System.out.println("ps : " + query);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	// delete 하는 메소드
	void delete(int empno) {
		connDB();
		
		try {
			
			String query = "delete from emp2";
			query += " where empno = ?";
			
			System.out.println("정상");
			
			PreparedStatement ps = con.prepareStatement(query);
			
			// insert문에 각 ? 에 순서대로 회원정보 세팅
			ps.setInt(1,empno);
			
			// 회원정보를 테이블에 추가
			int delete = ps.executeUpdate();
			if(delete > 0) {
				System.out.println("삭제 성공");
			} 
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
