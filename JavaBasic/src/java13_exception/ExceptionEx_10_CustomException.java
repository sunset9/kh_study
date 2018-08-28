package java13_exception;

class CheckEven{
	public void check(int num) throws EvenException {
		if( num % 2 != 0) {
			throw new EvenException();
		}
		System.out.println("¦���Դϴ�.");
	}
}

class EvenException extends Exception{
	@Override
	public String getMessage() {
		return "Ȧ�� �Է�";
	}
}

public class ExceptionEx_10_CustomException {
	public static void main(String[] args) {
		
		// ¦�� �Ǻ� ��ü
		CheckEven ce = new CheckEven();
		
		try {
			ce.check(13); // ���ܻ�Ȳ
						  // "Ȧ�� �Է�!!" - ���� �޼��� ���
		} catch (EvenException e) {
			e.printStackTrace();
		} 
		try {
			ce.check(12); // �����Ȳ
						  //"¦�� �Դϴ�." - ���� ���
		} catch (EvenException e) {
			e.printStackTrace();
		} 
		
		
	}
}
