package java10_api;

import java.util.Random;
import java.util.Scanner;

public class RandomQuiz {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int com = ran.nextInt(3) + 1;
			System.out.println(com);
			
			int user;
			do {
			System.out.printf("���������� �Է�(1~3): " );
			user= sc.nextInt();
			if (user<0) return;
			}while(user < 1 || user >3);
			
			System.out.println("��ǻ��: " + print(com));
			System.out.println("�����: " + print(user));
			
			if(user==com) {
				System.out.println("\n���º�");
			}else if((user-com) == 1 || (user-com) == -2) {
				System.out.println("\n�̱�");
			}else {
				System.out.println("\n��");
			}
			System.out.println("----------");
		}
	}
	public static String print(int i) {
		switch(i) {
		case 1: return "����";
		case 2: return "����";
		case 3: return "��";
		default: return null;
		}
	}
}
