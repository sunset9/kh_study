package java10_api;

import java.util.Random;
import java.util.Scanner;

public class Baskin31Quiz {
	public static void main(String[] args) {
		int[] arr31 = new int[32];
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int idx = 1;
		
		for(int i = 1;i<arr31.length;i++) {
			arr31[i] = i;
		}
		
		while(idx<=31) {
			System.out.print("1~3���� ���ڸ� �Է��ϼ���: ");
			int user = sc.nextInt();
			if(user>3 || user<1) {
				System.out.println("!!���ڸ� �ٽ� �Է��ϼ���.");
				continue;
			}
			
			//����� ��� - print(user)
			for(int i = 0; i<user; i++) {
				System.out.println("user: " + arr31[idx++]);
				if(idx>31){
					System.out.println("��ǻ�� ���!!");
					return;
				}
			}
			//��ǻ�� ���
			int com = ran.nextInt(3)+1;
			if(31-idx >=1 && 31-idx <=3) {
				com = 31 - idx;
			}
			for(int i = 0; i<com; i++) {
				System.out.println("com: " + arr31[idx++]);
				if(idx>31){
					System.out.println("����� ���!!");
					return;
				}
			}
		}
	}
}
