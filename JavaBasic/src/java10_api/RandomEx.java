package java10_api;

import java.util.Random;

public class RandomEx {
	public static void main(String[] args) {
		Random ran = new Random();
		
		System.out.println(ran.nextInt());
		System.out.println(ran.nextInt(10)); // 0~9
		
		System.out.println("----");
		System.out.println(ran.nextDouble());
		System.out.println(ran.nextBoolean());
		
		System.out.println("----");
		System.out.println(ran.nextInt(10)+1); // 1~10
		
		int[] arr = new int[5];
		
		for (int i = 0; i<arr.length; i++) {
			arr[i] = ran.nextInt(100)+1;  //1~100
		}
		
		for(int n:arr) {
			System.out.print(n + " ");
		}System.out.println();
	}
}
