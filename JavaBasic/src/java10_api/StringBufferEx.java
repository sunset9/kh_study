package java10_api;

public class StringBufferEx {
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		System.out.println("\n---Hello---");
		StringBuffer sb2 = new StringBuffer("Hello");
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());

		System.out.println("\n---5---");
		StringBuffer sb3 = new StringBuffer(5);
		System.out.println(sb3.length());
		System.out.println(sb3.capacity());
	
		System.out.println("---Apple 추가 ---");
		sb3.append("Apple");
		
		System.out.println("len: "+ sb3.length());
		System.out.println("cap: "+ sb3.capacity());
		System.out.println("sb3: " + sb3);
		
		System.out.println("---Banana 추가 ---");
		sb3.append("Banana");
		
		System.out.println("len: "+ sb3.length());
		System.out.println("cap: "+ sb3.capacity());
		System.out.println("sb3: " + sb3);
		
		//
		sb3.insert(5, "Orange");
		print(sb3);
		
		sb3.deleteCharAt(3);
		print(sb3);
		
		sb3.delete(0, 3);
		print(sb3);
		
		System.out.println("---");
		System.out.println(sb3.substring(1, 7));
		System.out.println("sb3: " + sb3);
		
		//trimToSize() - capa를 length만큼 줄이기
		sb3.trimToSize();
		print(sb3);
		
		System.out.println("---");
		System.out.println(sb3.reverse());
		System.out.println("sb3: " + sb3);
		
		
		
		
		
		
	}
	public static void print(StringBuffer sb3) {
		System.out.println("---");
		System.out.println("len: "+ sb3.length());
		System.out.println("cap: "+ sb3.capacity());
		System.out.println("sb3: " + sb3);
		
	}
}
