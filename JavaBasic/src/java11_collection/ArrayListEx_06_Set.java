package java11_collection;

import java.util.HashSet;
import java.util.Set;

public class ArrayListEx_06_Set {
	public static void main(String[] args) {
		
		Set set1 = new HashSet<>();
		Set set2 = new HashSet<>();
		Set set3 = new HashSet<>();
		
		set1.add(1);	set1.add(2);	set1.add(3);
		set2.add(3);	set2.add(4);	set2.add(5);
		set3.add(1);	set3.add(2);
		
		System.out.println("---부분집합---");
		System.out.println("set2는 set1의 부분집합인가: "+ set1.containsAll(set2)) ;
		System.out.println("set3는 set1의 부분집합인가: "+ set1.containsAll(set3)) ;
		
		System.out.println("---합집합---");
		set1.addAll(set2);
		System.out.println("set1 : " + set1);
		System.out.println("set2 : " + set2);
		
		System.out.println("---교집합---");
		set1.retainAll(set2);
		System.out.println("set1 : " + set1);
		
		System.out.println("---차집합---");
		set1.removeAll(set2);
		System.out.println("set1: " + set1);
	}
}


