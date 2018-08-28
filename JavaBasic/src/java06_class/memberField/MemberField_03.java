package java06_class.memberField;

public class MemberField_03 {

	private int num = 777; //인스턴스 변수
	private static int num2 = 555; //클래스 변수
	
	public static void method() {
//		System.out.println(num); //인스턴스 변수
		System.out.println(num2); //클래스 변수
	}
	
	// var -> 매개변수, 지역변수랑 같은 취급
	public void method2(int var) {
		int num = 101; // 지역변수
		int num2 = 202; // 지역변수
		
		System.out.println(num); // 지역변수
		System.out.println(this.num); // 인스턴스 변수
		
		System.out.println(num2); //지역변수
//		System.out.println(this.num2);
		System.out.println(MemberField_03.num2); // 정적변수
	}
}
