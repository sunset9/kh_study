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
		System.out.println("#���� : " + com);
		
		while (cnt <= CHANCE && right == false) {
			System.out.printf("[%d��° ��ȸ]���ڸ� �Է��ϼ���: ",cnt);
			user = sc.nextInt();
			
			if (com == user) {
				right = true;
				System.out.println("����!");
			}else if(com >user) {
				System.out.println("UP!");
			}else {
				System.out.println("DOWN!");
			}
			cnt++;
		}
		if(cnt>CHANCE) {
			System.out.println("7�� �ʰ�! ����!");
		}
		
	}

}
