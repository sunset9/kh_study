package java12_generics;

class Class02<T> {
	private T var1;
	protected T var2;
	
	public int num;
	String str;
	
	public void setVar1(T var1) {
		this.var1 = var1;
	}
	
	public <E> void out() {
		T v1;
		E e1;
	}
}

interface inter02<T> {
	int n = 0;
	public <E> void out();
}

public class GenericsEx_02_Basic {
	public static void main(String[] args) {

	}
}
