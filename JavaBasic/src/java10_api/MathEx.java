package java10_api;

public class MathEx {
	public static void main(String[] args) {
		
		//수학관련 클래스
		System.out.println("-10의 절대값: " + Math.abs(-10));
		
		System.out.println("3.7의 올림값: " + Math.ceil(3.7));	
		System.out.println("3.7의 내림값: " + Math.floor(3.7));
		
		System.out.println("-3.7의 올림값: " + Math.ceil(-3.7));	
		System.out.println("-3.7의 내림값: " + Math.floor(-3.7));
		
		System.out.println("2.1의 3제곱값: " + Math.pow(2.1, 3));
		
		System.out.println("랜덤값: " + Math.random());
		
		System.out.println("e의 3.3제곱값: " + Math.pow(Math.E, 3.3));
		
	}
}
