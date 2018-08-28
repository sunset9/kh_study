package java11_collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ArrayListEx_09_Map {
	public static void main(String[] args) {
		
		Map map = new HashMap();
		
		map.put(1, "Apple");
		map.put(2, "Banana");
		map.put(3, "Cherry");
		
		System.out.println(map);
		
		System.out.println("----");
		System.out.println(map.get(3));
		
		map.put("D", "Durian");
		System.out.println(map);
		System.out.println(map.get("D"));
		
		System.out.println("----------");
		map.put(2, "Orange");
		map.put(4,"Apple");
		
		System.out.println(map);
		
		System.out.println("----------");
		System.out.println(map.containsKey(5));
		System.out.println(map.containsValue("Apple"));
		
		System.out.println("----------");
		System.out.println(map.size());
		
		System.out.println("----------");
		System.out.println(map.isEmpty());
		
		System.out.println("----------");
		System.out.println(map.remove("D"));
		System.out.println(map.remove(2,"Apple"));
		System.out.println(map);
		
		System.out.println("-----null처리-----");
		map.put(10, null);
		map.put(null, "Bob");
		System.out.println(map);
		
		map.put(null, null);
		System.out.println(map);
		
		System.out.println("-----map -> set -----");
		Set keySet = map.keySet();
		Set entrySet = map.entrySet();
		
		System.out.println(keySet);
		System.out.println(entrySet);
		
		
		//활용
		Set keyList = map.keySet();
		Iterator iter = keyList.iterator();
		while(iter.hasNext()) {
			String val = (String) iter.next();
			
			System.out.println(map.get(val));
		}
		
	}
}


