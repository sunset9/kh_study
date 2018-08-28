package java06_class;

import java.util.Random;
import java.util.Scanner;

public class UpDownGame {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);

		int com, user;
		int cnt = 1;
		boolean right = false;
		final int CHANCE = 7;
		
		com = ran.nextInt(50) + 1;
		System.out.println("#정답 : " + com);
		
		while (cnt <= CHANCE && right == false) {
			System.out.printf("[%d번째 기회]숫자를 입력하세요: ",cnt);
			user = sc.nextInt();
			
			if (com == user) {
				right = true;
				System.out.println("정답!");
			}else if(com >user) {
				System.out.println("UP!");
			}else {
				System.out.println("DOWN!");
			}
			cnt++;
		}
		if(cnt>CHANCE) {
			System.out.println("7번 초과! 실패!");
		}
		
	}

}
