package ojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.Emp;

public class OjdbcEx_04 {
	// OJDBC DRIVER
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	// DB ���� ����
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USERNAME = "scott";
	private static final String PASSWORD = "tiger";
	
	// OJDBC ��ü
	private static Connection conn; // DB ���ᰴü
	private static PreparedStatement ps; // SQL ���ఴü
	private static ResultSet rs; // ��ȸ���
	
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
			
			// ���� ����� ���� List
			List<Emp> list = new ArrayList<>();
			
			// ���� ��� list �� ���
			while(rs.next()) {
				
				Emp emp = new Emp(); // �Ź� emp ��ü �����ؼ� list.add �� ���� ��ü�� list �� �ִ´�
				
				emp.setEmpno(rs.getInt("empno"));
				emp.setEname(rs.getString("ename"));
				emp.setJob(rs.getString("job"));
				emp.setMgr(rs.getInt("mgr"));
				emp.setHiredate(rs.getDate("hiredate"));
				emp.setSal(rs.getInt("sal"));
				emp.setComm(rs.getInt("comm"));
				emp.setDeptno(rs.getInt("deptno"));
				
				list.add(emp);
			}
			
			// ���� ��� ���
			for( Emp e : list) {
				System.out.println(e);
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
