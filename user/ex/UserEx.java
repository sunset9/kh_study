package user.ex;

import java.util.List;

import user.dao.UserDao;
import user.dao.UserDaoImpl;
import user.dto.User;

public class UserEx {
	public static void main(String[] args) {

		// DAO ����
		UserDao userDao = new UserDaoImpl();
		
		// ��ü ���
		List<User> list = userDao.selectAll();
		for(User u : list) {
			System.out.println(u);
		}
		
		// ���� ����
		//	userId : A123
		//	name : Alice
		System.out.println("-----------------");
		User insertUser = new User();
		insertUser.setUserid("A123");
		insertUser.setName("Alice");
		userDao.insertUser(insertUser);
		
		
		// ���� ��ȸ
		System.out.println("-----------------");
		User selectUser = userDao.selectByIdx(20);
		if(selectUser != null) System.out.println(selectUser);
		
		
		// ���� ����
		System.out.println("-----------------");
		userDao.deleteByIdx(20);
		
		
		// ���� ��ȸ
		System.out.println("-----------------");
		User resultUser = userDao.selectByIdx(20);
		if(resultUser != null) System.out.println(resultUser);
		
	}	
}











