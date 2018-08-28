package java12_generics;

// 제네릭 클래스
class Class03<T> {
	private T obj;

	//제네릭 메소드
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
		String fruit = c03.getObj(); // 항변환 불필요
		
		System.out.println(fruit);
				
				
	}
}
