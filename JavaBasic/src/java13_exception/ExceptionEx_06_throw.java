package java13_exception;

public class ExceptionEx_06_throw {
	public static void main(String[] args) {
		
		//���� �߻���Ű��
//		throw new NullPointerException();
		
		Exception e = new NullPointerException();
		
		try {
			throw e;
		} catch(NullPointerException e1) {
			System.out.println("null");
		}catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		System.out.println("���α׷� ����");
		
		
		
	}
}
