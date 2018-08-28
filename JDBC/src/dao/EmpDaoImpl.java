package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.Emp;

public class EmpDaoImpl implements EmpDao {
	// OJDBC ��ü
	private static Connection conn; // DB ���ᰴü
	private static PreparedStatement ps; // SQL ���ఴü
	private static ResultSet rs; // ��ȸ���
	
	public EmpDaoImpl() {
		try {
			// ����̹� �ε�
			Class.forName(DRIVER);
			// DB����
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
	
	@Override
	public List<Emp> getList() {
		List<Emp> list = new ArrayList<>();
		String sql = "SELECT * FROM emp ORDER BY empno";
		
		try {
			// PreparedStatement
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			// ResultSet ó��
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
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// conn �� close() �ϸ� �ȵ�. �ٸ� �޼ҵ忡�� ���� �� �����ϱ�.
				rs.close();
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		// List ó��
		return list;
	}

}
