package ojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OjdbcEx_01 {
	public static void main(String[] args) {
		
		// 1. JDBC 드라이버 로드 (ojdbc6.jar)
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		// OJDBC 사용에 필요한 변수들
		Connection conn = null; // DB 연결 객체
		Statement st = null; // SQL 수행 객체
		ResultSet rs = null; // 조회결과 반환 객체
		
		// 2. DB 연결 (Connection)
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			
			// 3. SQL 쿼리 수행
			// SQL 수행 객체 생성
			st = conn.createStatement();
			
			// SQL 수행 및 결과 반환
			rs = st.executeQuery("SELECT * FROM emp ORDER BY empno");
			
			// executeQuery - SQL 수행 메소드
			//  메소드의 반환타입은 ResultSet
			// SQL 수행 결과를 ResultSet으로 반환한다
			
			// 4. 결과 처리
			// rs 처음에는 null 가르킴
			while(rs.next()) { // 데이터가 없으면 false 반환 
				
				System.out.print(rs.getString("empno"));
				System.out.print(", " + rs.getString("ename"));
				System.out.print(", " + rs.getString("job"));
				System.out.print(", " + rs.getString("mgr"));
				System.out.print(", " + rs.getString("hiredate"));
				System.out.print(", " + rs.getString("sal"));
				System.out.print(", " + rs.getString("comm"));
				System.out.print(", " + rs.getString("deptno"));
				System.out.println();
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 5. 연결종료
			try {
				rs.close();
				st.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}