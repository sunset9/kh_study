package java11_collection;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ArrayListEx_07_Set {
	public static void main(String[] args) {
		
		Set set = new LinkedHashSet<>();
		set.add("apple");
		set.add("banana");
		set.add("cherry");
		System.out.println(set);
		
		System.out.println("-------");
		TreeSet tree = new TreeSet<>();
		
		tree.add("apple");
		tree.add("banana");
		tree.add("cherry");
		tree.add("dorian");
		System.out.println(tree);
		
		System.out.println("-------");
		Set head = tree.headSet("cherry");
		System.out.println(head);
		
		System.out.println("-------");
		Set tail = tree.tailSet("cherry");
		System.out.println(tail);
		
	}
}


