package java13_exception;

public class ExceptionEx_03_Basic_try {
	public static void main(String[] args) {
		
		int num1 = 7;
		int num2 = 0;
		
		try {
			System.out.println(num1 / num2);
		}catch(Exception e) {
			System.out.println(e);
			System.out.println("[warn] �������� 0�Դϴ�.");
		}
		
		System.out.println("���� ����");
	}
}
