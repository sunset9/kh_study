package java13_exception;

public class ExceptionEx_05_MultiCatch {
	public static void main(String[] args) {
		
		
		try {
			System.out.println("try 블록");
		}catch(ArithmeticException | NullPointerException e ) {
			
		}finally {
			
		}
		
		System.out.println("정상 종료");
	}
}
