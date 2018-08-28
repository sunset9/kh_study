package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import dto.Emp;

public interface EmpDao {
	// OJDBC DRIVER
	public static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	// DB ���� ����
	public static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	public static final String USERNAME = "scott";
	public static final String PASSWORD = "tiger";
	
	// Emp ���̺� ��ü ��ȸ
	// 	 ��ȯŸ��
	// 		List<Emp> - Emp���̺��� ��� ���� ���� List
	public List<Emp> getList();
}
