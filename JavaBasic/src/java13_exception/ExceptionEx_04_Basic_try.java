package java13_exception;

public class ExceptionEx_04_Basic_try {
	public static void main(String[] args) {
		
		int num1 = 7;
		int num2 = 0;
		
		try {
			System.out.println(num1 / num2);
		}catch(ArithmeticException e) {
			System.out.println(e);
			System.out.println("[warn] �������� 0�Դϴ�.");
		}catch(Exception e) {
			
		}finally {
			
		}
		
		System.out.println("���� ����");
	}
}
