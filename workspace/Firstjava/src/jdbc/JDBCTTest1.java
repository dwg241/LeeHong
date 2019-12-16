package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCTTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection conn = null;
		try {
		//드라이버로드
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("오라클 드라이버 완료!");
		String jdbcUrl= "jdbc:oracle:thin:@localhost:1521:orcl";
	    String user= "scott";
	    String pw= "tiger";
	    
	    conn = DriverManager.getConnection(jdbcUrl, user, pw);
	    System.out.println("데이터 베이스에 정상적인 접수가 되었습니다.");
		
		String sql2 = "insert into dept(deptno, dename, loc) value(?,?,?)";
	    PreparedStatement pstmt = conn.prepareStatement(sql2);
	    pstmt.setInt(1,50);
		pstmt.setString(2,"DEV");
		pstmt.setString(3,"SEOUL");
		
       Statement stmt = conn.createStatement();
		
       
		String sql1 = "select *from dept";
		ResultSet rs = stmt.executeQuery(sql1 );
		
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
				//호스트 포트  db name
		
				
		}catch(SQLException e) {	
			
			e.printStackTrace();
			
			
		}
	}

}
