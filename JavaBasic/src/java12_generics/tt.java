package java12_generics;

import java.util.Arrays;
import java.util.List;

public class tt {
	
	public static void main(String[] args) {
		print(100);
		print(235.2464);
//		print("Alice");
				
	}
	
	public static <T extends Number> void print(T t) {
		System.out.println(t);
	}
	
}

class list<E>{
	
}