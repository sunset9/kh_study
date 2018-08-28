package java12_generics;

class Data<T>{
	T data;
}
class Class06<T>{
	Data d1;
	Data<T> d2;
	Data<String> d3;
}

public class GenericsEx_06_ClassMember {
	public static void main(String[] args) {
		
		Class06<Integer> c6 = new Class06<>();
		
		c6.d1 = new Data<>(); // Object
		c6.d2 = new Data<>(); // T-> Integer
		c6.d3 = new Data<>(); // String
		
		
				
	}
}
