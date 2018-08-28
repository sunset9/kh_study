package java11_collection;

import java.util.LinkedList;
import java.util.Queue;

public class ArrayListEx_12_Queue {
	public static void main(String[] args) {
		
		Queue queue = new LinkedList<>();
		
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		
		System.out.println(queue);
		System.out.println(queue.size());
		
		System.out.println("------");
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.size());
		
		System.out.println("------");
		System.out.println(queue.peek());
		System.out.println(queue);
		System.out.println(queue.size());
		
		
		
	}
}


