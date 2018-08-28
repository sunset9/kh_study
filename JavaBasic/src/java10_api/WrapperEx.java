package java10_api;

public class WrapperEx {
	public static void main(String[] args) {

		int i1 = 10;
		Integer iVal1 = new Integer(i1); // 박싱, Boxing
		Integer iVal2 = new Integer("123");
		Integer iVal3 = new Integer(123);
		System.out.println(iVal1); //toString() 호출됨(객체니깐) - 값출력되게 바껴져있음
		
		double d1 = 123.456;
		Double dVal1 = new Double(d1); // 박싱
		Double dVal2 = new Double("234.567");
		System.out.println(dVal2);
		
		int i2 = iVal1.intValue(); // 언박싱
		double d2 = dVal1.doubleValue(); 
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		// 오토 박싱
		Integer iVal4 = 20;
		Double dVal3 = 333.44;
		
		// 오토 언박싱
		int i4 = iVal4;
		double d3 = dVal3;
		
		out(123); 
		// int -> Integer (오토박싱)
		// Integer -> Object (자동형변환, 부모타입으로) 
	}
	
	public static void out(Object obj) {
		System.out.println("obj: " + obj);
		// obj.toString() -> println에 객체 넣으면 toString()호출
		// 동적바인딩 -> Integer
		// Integer의 toString은 기본타입만 변환
		// 123
		
	}
}
