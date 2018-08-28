package java09_innerClass.quiz2;

public class ArrayEx {
	public static void main(String[] args) {
		Array ar = new Array();
		System.out.println(ar.getClass());
		
		ar.add("Apple");
		ar.add("Banana");
		ar.add("Cherry");
		ar.print(); // Apple, Banana, Cherry
		System.out.println("----------");
		
		ar.remove("Banana");
		ar.print(); // Apple, Cherry
		System.out.println("----------");

		System.out.println( ar.get(1) ); // Cherry
		System.out.println( ar.get(2) ); // null
		System.out.println("----------");
		
		System.out.println( ar.find("Apple") ); // 0
		System.out.println( ar.find("Banana") ); // -1
		System.out.println("----------");
	}
}










