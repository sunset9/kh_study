package java07_inheritance;

class Parent{
	int num;
	String name;
	
	public void display() {
		System.out.println("�θ� Ŭ������ �޼ҵ�");
	}
}

class Child extends Parent{
	int score;
	
	@Override //������̼�, Annotation
	public void display() { 
		System.out.print("��ӹ��� �޼ҵ��� ������/ ");
		System.out.println("�������̵�, Oberriding");
	}
	
	public void print() {
		System.out.println("�ڽ� Ŭ������ �޼ҵ�");
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