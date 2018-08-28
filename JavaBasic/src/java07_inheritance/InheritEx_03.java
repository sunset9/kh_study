package java07_inheritance;

class Parent3{
	public Parent3() {
		System.out.println("부모 디폴트 생성자");
	}
	public Parent3(int num) {
		System.out.println("매개변수있는 부모 생성자");
	}
}

class Child3 extends Parent3{
	public Child3() {
//		super(); //생략되어 있음
//		super(123);
		
		System.out.println("자식 디폴트 생성자");
	}
	public Child3(int num) {
//		super(num);
		
		System.out.println("매개변수있는 자식 생성자");
	}
	
}

public class InheritEx_03 {
	public static void main(String[] args) {
		
		Child3 c = new Child3(11);
		
		
	}
}


