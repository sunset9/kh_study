package java11_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx_02 {
	public static void main(String[] args) {

		List list1 = new ArrayList<>();
		
		List<String> list2 = new ArrayList<>();
		List list23 = new ArrayList<String>();
		
		List<Integer> list3 = new ArrayList<Integer>();
		
		list2.add("Apple"); //<String>으로 제한
		
		list3.add(111); // <Integer>로 제한
		list3.add((int) 23.443); // double 안됨
		
		System.out.println("----");
		
		// ...: 가변인자, 가변파라미터
		//  매개변수의 개수가 정해지지 않은 인자
		
		List intList = Arrays.asList(1,2,3,4,5); 
		System.out.println(intList);
		
		List strList = Arrays.asList("Alice","Bob", "Clare");
		System.out.println(strList);
		
		
	}
}
