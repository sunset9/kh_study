package ojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OjdbcEx_03 {
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USERNAME = "scott";
	private static final String PASSWORD = "tiger";
	
	private static Connection conn;
	private static Statement st;
	private static PreparedStatement ps; // �� �����ϰ� Ȱ�뵵 ŭ
	private static ResultSet rs;
	
	public static void main(String[] args) {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String sql = "SELECT * FROM emp WHERE job = ? ORDER BY empno"; // ?��� PreparedStatement ��밡��
		
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			
			ps = conn.prepareStatement(sql);
			// SQL�� ù��° ? �� �����͸� �ִ´�
			ps.setString(1, "SALESMAN");
			
			// SQL ���� ����
			rs = ps.executeQuery();
			
			while(rs.next()) {
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
			try {
				rs.close();
				ps.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
