package java06_class.methodQuiz;

public class Main {

	public static void main(String[] args) {
		FuncClass f = new FuncClass();
		
		int[] arr = { 1,2,3,4,5 };
		f.mul10(arr);
		f.print(arr);
		
		int[] arr2 = { 6,7,8,9,10 };
		int[] newArr;
		
		newArr = f.mul10_v2(arr2);
		f.print(arr2);
		f.print(newArr);
		
		
	}

}
