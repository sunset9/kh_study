package user.dao;

import java.util.List;

import user.dto.User;

public interface UserDao {

	//UserTest ���̺� ��ü ��ȸ
	//	idx ����
	public List<User> selectAll();
	
	// idx�� �̿��� UserTest ��ȸ
	//	1���� ��ȸ�ǵ��� �Ѵ�
	public User selectByIdx(int idx);
	
	// User ����
	public void insertUser(User insertUser);
	
	// idx�� �̿��� UserTest ����
	public void deleteByIdx(int idx);
	
}
