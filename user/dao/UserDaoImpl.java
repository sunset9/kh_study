package user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import user.dto.User;

public class UserDaoImpl implements UserDao{
	private final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String USERNAME = "scott";
	private final String PASSWORD = "tiger";
	
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public UserDaoImpl() {
		try {
			Class.forName(DRIVER);
			
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			
			// ����Ŀ�� ����(�⺻�� : true)
			// ����Ŀ�� �� �߰��� �������� ���α׷�����Ǹ� �ڵ�Ŀ��, ������ ���� �� ����
			conn.setAutoCommit(false); // �̷��� commit, rollback ������ ��������� �������
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	@Override
	public List<User> selectAll() {
		String sql = "SELECT * FROM userTest ORDER BY idx";
		List<User> userList = new ArrayList<>();
		
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				User user = new User();
				
				user.setIdx(rs.getInt("idx"));
				user.setUserid(rs.getString("userid"));
				user.setName(rs.getString("name"));
				
				userList.add(user);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return userList;
	}

	@Override
	public User selectByIdx(int idx) {
		String sql = "SELECT * FROM userTest WHERE idx = ?";
		User user = null;
		
		try {
			ps = conn.prepareStatement(sql);
			
			ps.setInt(1, idx);
			rs = ps.executeQuery();
			
			user = new User();
			if(rs.next()) {
				user.setIdx(rs.getInt("idx"));
				user.setName(rs.getString("name"));
				user.setUserid(rs.getString("userid"));
			} else {
				System.out.println("** ��ȸ: �ش� IDX�� �ش��ϴ� ������ �����ϴ�.");
				return null;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return user;
	}

	@Override
	public void insertUser(User insertUser) {
		String userId = insertUser.getUserid();
		String userName = insertUser.getName();
		String sql = "INSERT INTO userTest(idx, userid, name) VALUES (userTest_SQ.nextval,?,?)";
		String sql2 = "SELECT COUNT(*) FROM userTest WHERE userid = upper(?)";
		
		try {
			// �ߺ� ���̵� üũ
			PreparedStatement ps2 = conn.prepareStatement(sql2);
			ps2.setString(1, userId);
			rs = ps2.executeQuery();
			rs.next();
			// �ش� ���̵� �ִٸ� �߰� X
			if(rs.getInt(1) > 0) {
				System.out.println("** ����: ���� ID �� �����մϴ�.");
			} else {
				// user �߰�
				ps = conn.prepareStatement(sql);
				ps.setString(1, userId);
				ps.setString(2, userName);
				
				ps.executeUpdate();
			}
			
			conn.commit(); // ��������� Ŀ���ϱ�
			
		} catch (SQLException e) {
			e.printStackTrace();
			
			try {
				conn.rollback(); // ���� �߻� �� �ѹ� 
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			try {
				rs.close();
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}

	@Override
	public void deleteByIdx(int idx) {
		String sql = "DELETE userTest WHERE idx = ?";
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, idx);
			
			if( ps.executeUpdate() == 0) {
				System.out.println("** ����: �ش� IDX�� �ش��ϴ� ������ �����ϴ�.");
			}
			
			conn.commit(); // ��������� Ŀ���ϱ�
			
		} catch (SQLException e) {
			e.printStackTrace();
			
			try {
				conn.rollback(); // ���� �߻� �� �ѹ� 
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally { 
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
