package java13_exception;

public class ExceptionEx_02 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		int i = 0;
		while(true) {
			
			arr[i] = i + 1;
			System.out.println(arr[i]);
			
			i++;
		}
		
	}
}
