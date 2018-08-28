package java12_generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsEx_01_Basic {
	public static void main(String[] args) {
		
		List list1 = new ArrayList<>();
//		list1.add();	// boolean add(E e); E->Object
		
		List<String> list2 = new ArrayList<>();
//		list2.add("he"); // E->String
		
		List<Integer> list3 = new ArrayList<>();
//		list3.add(); // E->Integer
		
		// 타입안정성 체크
//		list2.add(123); // String타입만 가능
//		list3.add(true); // Integer타입만 가능
		
		// 타입안정성이 없음
		// 제네릭타입(타입파라미터)를 설정하지 않고 이용하고 있음
		//  - 개발자의 의도가 전해지지않음
		list1.add("A");
		list1.add(123);
		
		String str1 = (String) list1.get(0);
		Integer num1 = (Integer) list1.get(1);
		
		// 제네릭이 적용된 리스트
		String str2 = list2.get(0);
		
				
	}
}
