package java11_collection;

import java.util.HashSet;
import java.util.Set;

public class ArrayListEx_05_Set {
	public static void main(String[] args) {
		
		Set set = new HashSet<>();
		
		set.add(11);
		set.add(22);
		set.add(33);
		set.add(11);
		
		System.out.println(set);
		
	}
}

