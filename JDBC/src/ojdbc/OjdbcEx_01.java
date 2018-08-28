package ojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OjdbcEx_01 {
	public static void main(String[] args) {
		
		// 1. JDBC ����̹� �ε� (ojdbc6.jar)
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		// OJDBC ��뿡 �ʿ��� ������
		Connection conn = null; // DB ���� ��ü
		Statement st = null; // SQL ���� ��ü
		ResultSet rs = null; // ��ȸ��� ��ȯ ��ü
		
		// 2. DB ���� (Connection)
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			
			// 3. SQL ���� ����
			// SQL ���� ��ü ����
			st = conn.createStatement();
			
			// SQL ���� �� ��� ��ȯ
			rs = st.executeQuery("SELECT * FROM emp ORDER BY empno");
			
			// executeQuery - SQL ���� �޼ҵ�
			//  �޼ҵ��� ��ȯŸ���� ResultSet
			// SQL ���� ����� ResultSet���� ��ȯ�Ѵ�
			
			// 4. ��� ó��
			// rs ó������ null ����Ŵ
			while(rs.next()) { // �����Ͱ� ������ false ��ȯ 
				
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
			// 5. ��������
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