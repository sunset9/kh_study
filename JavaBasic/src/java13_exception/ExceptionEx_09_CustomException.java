package java13_exception;

class User{
	private int age;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) throws UserAgeException{
		
		if(age < 0) {
			this.age = -1; // 나이 잘못 입력
			throw new UserAgeException();
		}
		
//		if (age < 0) {
//			System.out.println("나이는 0보다 작을 수 없다");
//			this.age = -1; // 나이 잘못 입력
//			return;
//		}
		
		this.age = age;
	}
}

class UserAgeException extends Exception{
	@Override
	public String getMessage() {
		return "나이는 0보다 작을 수 없다";
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
		
		
		System.out.println("입력된 나이: " + user.getAge());
	
	}
}
