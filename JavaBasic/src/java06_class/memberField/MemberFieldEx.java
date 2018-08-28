package java06_class.memberField;

public class MemberFieldEx {
	public static void main(String[] args) {
		
		MemberField_01 m1 = new MemberField_01();
		MemberField_01 m2 = new MemberField_01();
		MemberField_03 m3;
		
		m1.setNum(100);
		m2.setNum(200);
//		m3.setNum(300); // 초기화되지않아 안됨
		System.out.println(m1.getNum());
		System.out.println(m2.getNum());
		

		MemberField_02 m4 = new MemberField_02();
		MemberField_02 m5 = new MemberField_02();
		
//		m4.city = "Seoul";
//		m5.city = "Busan";
		
		// 클래스 당 하나만 생성되니까. 클래스를 통해 접근하는게 좋음
//		MemberField_02.city = "Incheon";
		
		System.out.println(MemberField_02.getCity());
		MemberField_02.setCity("Busan");
		System.out.println(MemberField_02.getCity());
		
		
		MemberField_03 m6 = new MemberField_03();
//		m6.method();
		MemberField_03.method();
		m6.method2(0);
		
	}
		
}
