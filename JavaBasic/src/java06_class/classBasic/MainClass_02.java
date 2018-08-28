package java06_class.classBasic;

public class MainClass_02 {

	public static void main(String[] args) {

		ClassEx_02 ce; //객체 선언
		ce = new ClassEx_02(); // 객체 생성, 인스턴스화
		
//		System.out.println(ce.num1);
		System.out.println(ce.num2);
		System.out.println(ce.num3);
		System.out.println(ce.num4);
		
		ce.setNum1(123);
		System.out.println( ce.getNum1());
		
	}

}
