package java14_io.filterStream;

import java.util.Scanner;

public class tt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String a = sc.nextLine();
		String b = sc.nextLine();
		if(a.equals(" ")) {
			System.out.println("a");
		}
		System.out.println(b.isEmpty());
		System.out.println(b.length());
		System.out.println(b.equals(" "));
		if(b.trim().length()<=0) {
			System.out.println("a");
		}
	}
}
