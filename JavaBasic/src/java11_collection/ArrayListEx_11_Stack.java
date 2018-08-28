package java11_collection;

import java.util.Stack;

public class ArrayListEx_11_Stack {
	public static void main(String[] args) {
		
		Stack<String> st = new Stack<String>();
		
		System.out.println("------");
		st.push("Apple");
		st.push("Banana");
		st.push("Cherry");
		
		System.out.println(st);
		System.out.println(st.size());
		
		System.out.println("------");
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println(st.size());
		
		System.out.println("------");
		System.out.println(st.peek());
		System.out.println(st);
		System.out.println(st.size());
		
	}
}


