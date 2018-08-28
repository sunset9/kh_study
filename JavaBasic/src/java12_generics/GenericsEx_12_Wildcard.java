package java12_generics;

import java.util.Arrays;
import java.util.List;

public class GenericsEx_12_Wildcard {
	
	public static void display(List<? super Integer> l) {
//	public static void display(List<Object> l) {
		for(Object o : l) {
			System.out.println(o);
		}
	}
	public static void main(String[] args) {
		List<Integer> iList = Arrays.asList(10, 20 , 30);
		List<String> sList = Arrays.asList("A", "B", "C");
		
		display(iList);
//		display(sList);
	}
}
