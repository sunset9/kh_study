package java07_inheritance;

class Parent3{
	public Parent3() {
		System.out.println("�θ� ����Ʈ ������");
	}
	public Parent3(int num) {
		System.out.println("�Ű������ִ� �θ� ������");
	}
}

class Child3 extends Parent3{
	public Child3() {
//		super(); //�����Ǿ� ����
//		super(123);
		
		System.out.println("�ڽ� ����Ʈ ������");
	}
	public Child3(int num) {
//		super(num);
		
		System.out.println("�Ű������ִ� �ڽ� ������");
	}
	
}

public class InheritEx_03 {
	public static void main(String[] args) {
		
		Child3 c = new Child3(11);
		
		
	}
}


