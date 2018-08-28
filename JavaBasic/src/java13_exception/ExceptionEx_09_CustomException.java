package java13_exception;

class User{
	private int age;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) throws UserAgeException{
		
		if(age < 0) {
			this.age = -1; // ���� �߸� �Է�
			throw new UserAgeException();
		}
		
//		if (age < 0) {
//			System.out.println("���̴� 0���� ���� �� ����");
//			this.age = -1; // ���� �߸� �Է�
//			return;
//		}
		
		this.age = age;
	}
}

class UserAgeException extends Exception{
	@Override
	public String getMessage() {
		return "���̴� 0���� ���� �� ����";
	}
}

public class ExceptionEx_09_CustomException {
	public static void main(String[] args) {
		
		User user = new User();
		
		try {
			user.setAge(-5);
		} catch (UserAgeException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("�Էµ� ����: " + user.getAge());
	
	}
}
