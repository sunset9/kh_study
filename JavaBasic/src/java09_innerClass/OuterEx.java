package java09_innerClass;

public class OuterEx {
	public static void main(String[] args) {
		Outer o = new Outer();
		System.out.println(o.num); // 인스턴스 변수
		o.print(); //멤버 메소드
		System.out.println("------------");
		
		Outer.MemberInner memIn;
		memIn = o.new MemberInner(); // 객체를 통한 생성자 호출
		System.out.println(memIn.num);
		memIn.print();
//		System.out.println(o.mi.num);
//		o.mi.print();
		System.out.println("------------");
		
		System.out.println(Outer.staticNum); // 정적변수
		
		// 정적 중첩 클래스의 정적필드(정적변수)
		System.out.println(Outer.StaticInner.num);
		Outer.StaticInner.out(); // 정적중첩클래스의 정적메소드
		System.out.println("------------");
		
		// 멤버 메소드 호출
		o.out(); // 지역 중첩 클래스 생성되고 메소드 호출됨
		
	}
		
}
