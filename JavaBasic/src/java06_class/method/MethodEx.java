package java06_class.method;

// 실행클래스
public class MethodEx { // Ex-> executor : main 있는 클래스
	public static void main(String[] args) {
//		Method_01 m = new Method_01();
//		System.out.println(m.add(1, 4));
//		
//		System.out.println("-----");
//		Method_02 m2 = new Method_02();
//		
//		m2.method01();
//		m2.method02(777);
//		m2.printNum2(11, 22);
//		System.out.println(m2.returnNum());
//		
//		
//		Method_03 m3 = new Method_03();
//		m3.printI();
//		
//		m3.printH(3);
//		
//		m3.printS(2, "bye");
//		
		
		Method_04 m4 = new Method_04();
		
		int[] arr = new int[5];
		
		m4.arrayTest01(arr); // 얕은 복사. 같은 공간 바라봄
		
		for (int num:arr) {
			System.out.println(num);
		}
		
//		int n = 10;
//		m4.arrayTest02(n);
//		System.out.println(n);
	}
}
