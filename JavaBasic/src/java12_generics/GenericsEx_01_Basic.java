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
		
		// Ÿ�Ծ����� üũ
//		list2.add(123); // StringŸ�Ը� ����
//		list3.add(true); // IntegerŸ�Ը� ����
		
		// Ÿ�Ծ������� ����
		// ���׸�Ÿ��(Ÿ���Ķ����)�� �������� �ʰ� �̿��ϰ� ����
		//  - �������� �ǵ��� ������������
		list1.add("A");
		list1.add(123);
		
		String str1 = (String) list1.get(0);
		Integer num1 = (Integer) list1.get(1);
		
		// ���׸��� ����� ����Ʈ
		String str2 = list2.get(0);
		
				
	}
}
