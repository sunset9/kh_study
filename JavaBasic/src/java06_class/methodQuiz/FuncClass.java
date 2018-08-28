package java06_class.methodQuiz;

public class FuncClass {

	public void mul10(int[] arr) {
		for(int i = 0;i<arr.length;i++) {
			arr[i] *= 10;
		}
	}
	
	public int[] mul10_v2(int[] arr) {
		int[] resArr = new int[arr.length];
		System.arraycopy(arr, 0, resArr, 0, arr.length);
		for(int i = 0; i<resArr.length;i++) {
			resArr[i] *= 10;
		}
		return resArr;
	}
	
	public void print(int[] arr) {
		for(int i:arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
