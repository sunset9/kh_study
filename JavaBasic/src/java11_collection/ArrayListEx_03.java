package java11_collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx_03 {
	public static void main(String[] args) {

		// �ݺ��� , iterator
		// �÷����� ��ҵ��� �о���� ����� ǥ��ȭ�� ��
		
		List<String> list = Arrays.asList("A","B","C","D","E");
		
		Iterator iter; // �ݺ���
		iter = list.iterator(); // ����Ʈ�� iterator ����
		
		while(iter.hasNext()) {
			// string ���
			System.out.println(iter.next());
		}
	}
}
