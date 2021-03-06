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
	// DB 연결 정보
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USERNAME = "scott";
	private static final String PASSWORD = "tiger";
	
	// OJDBC 객체
	private static Connection conn; // DB 연결객체
	private static PreparedStatement ps; // SQL 수행객체
	private static ResultSet rs; // 조회결과
	
	public static void main(String[] args) {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String sql = "SELECT * FROM emp WHERE job = ? ORDER BY empno"; // ?없어도 PreparedStatement 사용가능
		
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			
			ps = conn.prepareStatement(sql);
			// SQL의 첫번째 ? 에 데이터를 넣는다
			ps.setString(1, "SALESMAN");
			
			// SQL 쿼리 수행
			rs = ps.executeQuery();
			
			// 쿼리 결과를 담은 List
			List<Emp> list = new ArrayList<>();
			
			// 쿼리 결과 list 에 담기
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
			
			// 쿼리 결과 출력
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
