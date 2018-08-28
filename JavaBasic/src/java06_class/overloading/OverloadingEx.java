package java06_class.overloading;

public class OverloadingEx {
	public static void main(String[] args) {
		Overload_01 o1 = new Overload_01();
		
		System.out.println("---display()---");
		o1.display();
		
		System.out.println("---display(int, int)---");
		o1.display(1,5);
		
		// 문자수
		System.out.printf("112233의 문자수: ");
		Overload_02 o2 = new Overload_02();
		System.out.println(o2.getLength(112233));
		System.out.printf("1122.33의 문자수: ");
		System.out.println(o2.getLength(1122.33));
		System.out.printf("'boolen'의 문자수: ");
		System.out.println(o2.getLength(false));
	}
}
