package ojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OjdbcEx_02 {
	
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USERNAME = "scott";
	private static final String PASSWORD = "tiger";
	
	private static Connection conn;
	private static Statement st;
	private static ResultSet rs;
	
	public static void main(String[] args) {
		// 드라이버 로드
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		// SQL 작성
		String sql = "CREATE TABLE userTest("
				+ " idx NUMBER CONSTRAINT PK_USER_TEST PRIMARY KEY,"
				+ " NAME VARCHAR(50) NOT NULL,"
				+ " PHONE VARCHAR(30) NOT NULL )";
		
		String sql2 ="CREATE SEQUENCE seq_usertest"
				+ " INCREMENT BY 1"
				+ " START WITH 1";
		
		// DB 연결
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			
			st = conn.createStatement();
			
			st.execute(sql);
			st.execute(sql2);
			
			rs = st.executeQuery("SELECT COUNT(*) FROM TABS WHERE TABLE_NAME = UPPER('userTest')");
			while(rs.next()) {
				if(rs.getInt(1) == 1) {
					System.out.println("테이블 생성 성공");
				}
			}
			rs = st.executeQuery("SELECT COUNT(*) FROM USER_SEQUENCES WHERE SEQUENCE_NAME = UPPER('seq_usertest')");
			while(rs.next()) {
				if(rs.getInt(1) == 1) {
					System.out.println("시퀀스 생성 성공");
				}
			}
				
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
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
