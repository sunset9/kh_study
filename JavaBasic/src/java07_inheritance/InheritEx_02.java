package java07_inheritance;

class Parent2{
	protected int num;

	protected void display() {
		System.out.println("부모 메소드");
	}
}
class Child2 extends Parent2{

	private int num;
	
	@Override
	public void display() {
		System.out.println("오버라이딩 메소드");
	}
}

public class InheritEx_02 {
	public static void main(String[] args) {
	
		Child2 c = new Child2();
		
//		c.num = 123;
		c.display();
		
		System.out.println("---------------");
		Parent2 p = new Parent2();
		p.display();
		
		System.out.println("---------------");
		//자동형변환도 된다.
		Parent2 pc = (Parent2) new Child2();
		pc.display();
	}
	
}



