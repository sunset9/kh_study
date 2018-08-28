package java11_collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayListEx_04 {
	public static void main(String[] args) {

		List list = new LinkedList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Chery");
		
		System.out.println(list);
		
		System.out.println("----");
		List v = new Vector<>();
		v.add("A");
		v.add("B");
		v.add("C");
		
		System.out.println(v);

	}
}

