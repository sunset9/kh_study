package java06_class.classBasic;

public class MainClass_01 {

	public static void main(String[] args) {
		
		ClassEx_01 ce; // 객체 변수 선언
		
		ce = new ClassEx_01(); //ClassEx 객체 생성
		
		// 멤버필드 초기화(대입)
		ce.num = 100;
		ce.str = "Apple";
		
		// 멤버메소드 호출
		ce.display();
		
		
		ClassEx_01 ce2 = new ClassEx_01();
		
	}

}
