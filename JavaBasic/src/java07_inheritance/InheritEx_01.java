package java07_inheritance;

class Parent{
	int num;
	String name;
	
	public void display() {
		System.out.println("부모 클래스의 메소드");
	}
}

class Child extends Parent{
	int score;
	
	@Override //어노테이션, Annotation
	public void display() { 
		System.out.print("상속받은 메소드의 재정의/ ");
		System.out.println("오버라이딩, Oberriding");
	}
	
	public void print() {
		System.out.println("자식 클래스의 메소드");
	}
}

public class InheritEx_01 {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.display();
		
		Child c = new Child();
		c.num = 123;
		
		c.display();
		c.print();
		
	}
	
}