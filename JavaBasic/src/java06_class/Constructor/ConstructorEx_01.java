package java06_class.Constructor;

public class ConstructorEx_01 {

	public static void main(String[] args) {

		Constructor_01 c;
		c = new Constructor_01();
		c.out();
		
		Constructor_01 c2;
		c2 = new Constructor_01(77,88);
		c2.out();
		
		
	}

}

class Constructor_01 {
	private int num1;
	private int num2 = 200;

	// 디폴트 생성자
	public Constructor_01() {
		num1 = 100;
		num2 = 300; // 필드 초기화 이후에 동작
	}
	
	public Constructor_01(int num1, int num2) {
		setNum1(num1); // this.num1 = num1;
		setNum2(num2); // this.num2 = num2;
	}

	// num1 의 값을 출력하는 메소드
	public void out() {
		System.out.println("num1: " + num1 + ", num2: " + num2);
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

}
