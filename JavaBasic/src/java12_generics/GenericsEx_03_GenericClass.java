package java12_generics;

// ���׸� Ŭ����
class Class03<T> {
	private T obj;

	//���׸� �޼ҵ�
	public<K> void display(K obj) {
		T data; 
	}
	
	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
}

public class GenericsEx_03_GenericClass {
	public static void main(String[] args) {

		Class03<String> c03 = new Class03<>();
		
		c03.setObj("Apple");
		String fruit = c03.getObj(); // �׺�ȯ ���ʿ�
		
		System.out.println(fruit);
				
				
	}
}
