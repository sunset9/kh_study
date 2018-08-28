package java12_generics;

// 일반 클래스
class Class04 {
	
	// 제네릭 메소드
	public <T> void display(Integer num) {
		T data;
		data = (T)num;
	}
	
	public <T> T out (T obj) {
		T data;
		data = obj;
		
		return data;
	}
}

public class GenericsEx_04_GenricMethod {
	public static void main(String[] args) {

		Class04 c04 = new Class04();
		
		c04.display(123); // T->Object
		c04.<Double>display(333); // T->Double
		
		c04.out("Aclie"); // 제네릭타입 자동결정 T -> String
//		c04.<Integer>out("Bob");
		
		c04.<Integer>out(444);
				
				
	}
}
