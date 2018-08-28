package java05_array;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
		final int pay = 12000;
		
		int[] arr = new int[6];
		int[] arr2 = new int[6];
		int totalPerson = 0;
		
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("-------------입력");
		for (int i = 0 ; i<arr.length -1 ; i++) {
			System.out.printf("%d층의 사는 인원은?",i+1);
			arr[i] = sc.nextInt();
			totalPerson += arr[i];
			
			arr2[i] = arr[i] * pay; 
		}
		arr[5] = totalPerson;
		arr2[5] = arr[5] * pay;
		
		System.out.println("-------------출력");
		for (int i = 0 ; i<arr2.length -1 ; i++) {
			System.out.printf("%d층의 총 관리비: %d원\n",i+1, arr2[i]);
		}
		
		System.out.printf("\n건물에 사는 총 인원은 %d명 입니다.\n", arr[5]);
		System.out.printf("관리비의 총 금액은 %d원 입니다.", arr2[5]);

	}

}
