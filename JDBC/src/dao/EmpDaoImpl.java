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
	// OJDBC 객체
	private static Connection conn; // DB 연결객체
	private static PreparedStatement ps; // SQL 수행객체
	private static ResultSet rs; // 조회결과
	
	public EmpDaoImpl() {
		try {
			// 드라이버 로드
			Class.forName(DRIVER);
			// DB연결
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
			
			// ResultSet 처리
			while(rs.next()) {
				Emp emp = new Emp(); // 매번 emp 객체 생성해서 list.add 를 통해 객체를 list 에 넣는다
				
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
				// conn 은 close() 하면 안됨. 다른 메소드에서 쓰일 수 있으니깐.
				rs.close();
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		// List 처리
		return list;
	}

}
