package java12_generics;

import java.util.Arrays;
import java.util.List;

public class GenericsEx_11_Wildcard2 {
	
	public static void display(List<? extends Number> l) {
//	public static void display(List<Object> l) {
		for(Object o : l) {
			System.out.println(o);
		}
	}
	public static void main(String[] args) {
		List<Number> iList = Arrays.asList(10, 22.22 , 30);
		List<String> sList = Arrays.asList("A", "B", "C");
		
		display(iList);
//		display(sList); // <? extends Number>�� NumberŬ������ ���� Ŭ������ Ÿ���Ķ���ͷ� ���� �� �ִ�
		
	}
}
