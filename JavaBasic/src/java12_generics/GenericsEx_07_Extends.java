package java12_generics;


public class GenericsEx_07_Extends {
	public static void main(String[] args) {
		print(100);
		print(235.2464);
//		print("Alice");
				
	}
	
	public static <T extends Number,E> void print(T t) {
		System.out.println(t);
	}
}
