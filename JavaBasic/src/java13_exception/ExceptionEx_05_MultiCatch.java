package java13_exception;

public class ExceptionEx_05_MultiCatch {
	public static void main(String[] args) {
		
		
		try {
			System.out.println("try ���");
		}catch(ArithmeticException | NullPointerException e ) {
			
		}finally {
			
		}
		
		System.out.println("���� ����");
	}
}
