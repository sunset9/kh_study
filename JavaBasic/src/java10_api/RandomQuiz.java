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
			System.out.printf("가위바위보 입력(1~3): " );
			user= sc.nextInt();
			if (user<0) return;
			}while(user < 1 || user >3);
			
			System.out.println("컴퓨터: " + print(com));
			System.out.println("사용자: " + print(user));
			
			if(user==com) {
				System.out.println("\n무승부");
			}else if((user-com) == 1 || (user-com) == -2) {
				System.out.println("\n이김");
			}else {
				System.out.println("\n짐");
			}
			System.out.println("----------");
		}
	}
	public static String print(int i) {
		switch(i) {
		case 1: return "가위";
		case 2: return "바위";
		case 3: return "보";
		default: return null;
		}
	}
}
