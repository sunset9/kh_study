package java06_class.method;

public class Method_02 {
	public void method01() {
		System.out.println("Hello");
	}

	public void method02(int parm) {
		System.out.println("전달인자: " + parm);
	}

	public void printNum2(int num1, int num2) {
		System.out.println("num1: " + num1 + ",num2: " + num2);
	}
	
	public int returnNum() {
		return 123;
	}
}
