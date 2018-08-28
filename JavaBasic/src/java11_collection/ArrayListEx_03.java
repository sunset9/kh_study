package java11_collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx_03 {
	public static void main(String[] args) {

		// 반복자 , iterator
		// 컬렉션의 요소들을 읽어오는 방법을 표준화한 것
		
		List<String> list = Arrays.asList("A","B","C","D","E");
		
		Iterator iter; // 반복자
		iter = list.iterator(); // 리스트의 iterator 생성
		
		while(iter.hasNext()) {
			// string 요소
			System.out.println(iter.next());
		}
	}
}
