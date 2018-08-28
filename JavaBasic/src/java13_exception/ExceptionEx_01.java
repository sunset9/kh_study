package java13_exception;

public class ExceptionEx_01 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		int i = 0;
		try {
			while(true) {
				arr[i] = i + 1;
				System.out.println(arr[i]);
				
				i++;
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("[Warning]");
//			e.printStackTrace();
		}
		
		System.out.println(" \n+ 프로그램 종료 + \n");
		
	}
}
