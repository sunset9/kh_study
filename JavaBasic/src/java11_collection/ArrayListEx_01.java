package java11_collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx_01 {
	
	public static void main(String[] args) {
		// ��ȸ(Ž��), �߰�/����, ����, ����
		
		List list;
		list = new ArrayList<>();
		
		System.out.println("---����---");
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");
		System.out.println(list.toString());
		
//		for(String str:list) {
//			System.out.println(str);
//		}
		
		System.out.println("\n---contains()---");
		System.out.println(list.contains("Tomato"));
		
		System.out.println("\n---isEmpty()---");
		System.out.println( list.isEmpty());
		
		List l = null;
		if(l == null);	//true
//		if(l.isEmpty()); // ����!!
		
		List ll = new ArrayList();
		if(ll == null); //false
		if(ll.isEmpty()); //true
		
		System.out.println(l);
		System.out.println(ll);
		
		
		list.add(123);
		list.add(12.33);
		list.add(true);
		
		// foreach �� ���
		System.out.println("----");
		for(Object o :list) {
			System.out.println(o);
		}
	}
	
	

}
