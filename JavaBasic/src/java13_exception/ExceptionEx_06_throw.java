package java13_exception;

public class ExceptionEx_06_throw {
	public static void main(String[] args) {
		
		//예외 발생시키기
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
		
		System.out.println("프로그램 종료");
		
		
		
	}
}
