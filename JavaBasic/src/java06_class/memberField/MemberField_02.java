package java06_class.memberField;

public class MemberField_02 {
	
	// 클래스 변수, 정적 변수, static 변수
	private static String city = "Seoul";

	// static 키워드 ( 정적 키워드 )
	// : 클래스의 멤버를 인스턴스화 없이 사용할 수 있게 해준다.
	// : 멤버필드, 멤버메소드 모두 적용됨
	// : 인스턴스가 아닌 클래스단위로 제어되게 한다.
	
	// 특이사항
	// static메소드에서 인스턴스 변수를 사용할 수 없다.
	// static메소드에서는 static 변수(정적 변수)만 사용해야한다.
	// 일반메소드에서는 정적, 인스턴스 변수 둘다 사용가능
	
	// ** main()메소드는 정적메소드
	
	public static String getCity() {
		return city;
	}

	public static void setCity(String city) {
		MemberField_02.city = city;
	}
	
}
