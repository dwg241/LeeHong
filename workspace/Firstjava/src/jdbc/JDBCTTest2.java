package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection conn = null;
		try {
		//드라이버로드
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("MYsql 드라이버 완료!");
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/project?serverTimezone=UTC";
		String user = "kite";
		String pw = "11111111"; // 
		
		conn = DriverManager.getConnection(jdbcUrl, user, pw);
		System.out.println("데이터베이스에 접속했습니다.");
		
		
		//dept 테이블 로드

		Statement stmt = conn.createStatement();
		
		ResultSet rs = stmt.executeQuery(sql1);
		
		while(rs.next()) {
			
			
			int deptno =rs.getInt("deptno");
			String dname = rs.getString("dname");
			String loc = rs.getString("loc");
			
			System.out.println(deptno + "|" + dname+ "|" + loc);
			
			
		}
		
		
		rs.close();
		stmt.close();
		conn.close();
				
		
		
		
		
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
