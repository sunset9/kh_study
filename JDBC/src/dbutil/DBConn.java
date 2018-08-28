package dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {
	// DB ���� ����
	public static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	public static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	public static final String USERNAME = "scott";
	public static final String PASSWORD = "tiger";
	
	// DB ���ᰴü
	private static Connection conn = null;
	
	// private ������
	private DBConn(){
	}
	
	// Connection ��ü ��ȯ = Singleton Pattern
	public static Connection getConnection() {

		// DB ������ �ȵǾ����� ���� ���� 
		if (conn == null) {
			try {
				Class.forName(DRIVER); //����̹� �ε�
				
				// DB ���ᰴü ����
				conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return conn;
	}
}
