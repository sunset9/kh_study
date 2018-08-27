package user.ex;

import java.util.List;

import user.dao.UserDao;
import user.dao.UserDaoImpl;
import user.dto.User;

public class UserEx {
	public static void main(String[] args) {

		// DAO 생성
		UserDao userDao = new UserDaoImpl();
		
		// 전체 출력
		List<User> list = userDao.selectAll();
		for(User u : list) {
			System.out.println(u);
		}
		
		// 유저 삽입
		//	userId : A123
		//	name : Alice
		System.out.println("-----------------");
		User insertUser = new User();
		insertUser.setUserid("A123");
		insertUser.setName("Alice");
		userDao.insertUser(insertUser);
		
		
		// 유저 조회
		System.out.println("-----------------");
		User selectUser = userDao.selectByIdx(20);
		if(selectUser != null) System.out.println(selectUser);
		
		
		// 유저 삭제
		System.out.println("-----------------");
		userDao.deleteByIdx(20);
		
		
		// 유저 조회
		System.out.println("-----------------");
		User resultUser = userDao.selectByIdx(20);
		if(resultUser != null) System.out.println(resultUser);
		
	}	
}











