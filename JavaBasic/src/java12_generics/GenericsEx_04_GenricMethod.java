package java12_generics;

// �Ϲ� Ŭ����
class Class04 {
	
	// ���׸� �޼ҵ�
	public <T> void display(Integer num) {
		T data;
		data = (T)num;
	}
	
	public <T> T out (T obj) {
		T data;
		data = obj;
		
		return data;
	}
}

public class GenericsEx_04_GenricMethod {
	public static void main(String[] args) {

		Class04 c04 = new Class04();
		
		c04.display(123); // T->Object
		c04.<Double>display(333); // T->Double
		
		c04.out("Aclie"); // ���׸�Ÿ�� �ڵ����� T -> String
//		c04.<Integer>out("Bob");
		
		c04.<Integer>out(444);
				
				
	}
}
