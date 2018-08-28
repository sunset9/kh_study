package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import dto.Emp;

public interface EmpDao {
	// OJDBC DRIVER
	public static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	// DB 연결 정보
	public static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	public static final String USERNAME = "scott";
	public static final String PASSWORD = "tiger";
	
	// Emp 테이블 전체 조회
	// 	 반환타입
	// 		List<Emp> - Emp테이블의 모든 행을 담은 List
	public List<Emp> getList();
}
