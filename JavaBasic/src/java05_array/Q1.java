package java05_array;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
		final int pay = 12000;
		
		int[] arr = new int[6];
		int[] arr2 = new int[6];
		int totalPerson = 0;
		
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("-------------�Է�");
		for (int i = 0 ; i<arr.length -1 ; i++) {
			System.out.printf("%d���� ��� �ο���?",i+1);
			arr[i] = sc.nextInt();
			totalPerson += arr[i];
			
			arr2[i] = arr[i] * pay; 
		}
		arr[5] = totalPerson;
		arr2[5] = arr[5] * pay;
		
		System.out.println("-------------���");
		for (int i = 0 ; i<arr2.length -1 ; i++) {
			System.out.printf("%d���� �� ������: %d��\n",i+1, arr2[i]);
		}
		
		System.out.printf("\n�ǹ��� ��� �� �ο��� %d�� �Դϴ�.\n", arr[5]);
		System.out.printf("�������� �� �ݾ��� %d�� �Դϴ�.", arr2[5]);

	}

}
