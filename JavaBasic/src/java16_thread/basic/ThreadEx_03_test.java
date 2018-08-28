package java16_thread.basic;

import java.util.Random;

public class ThreadEx_03_test extends Thread {
	
	private int idx; //������ �ε���
	
	public ThreadEx_03_test(int idx) {
		this.idx = idx;
	}
			
	@Override
	public void run() {
		System.out.println(idx + "������ ����");
		
		Random ran = new Random();
		try {
			Thread.sleep(ran.nextInt(3000)); // �ִ� 3�ʱ��� sleep�ɸ���
		} catch (InterruptedException e) { }
		
		System.out.println(idx + "������ ��");
	}
	
	public static void main(String[] args) {
//		new ThreadEx_03_test().start(); //run, main�޼ҵ尡 ���ÿ� ����
		
		System.out.println("Main ������ ����");
		
		for(int i=0; i<10; i++) {
			new ThreadEx_03_test(i).start();
		}
		
		System.out.println("Main ������ ��");
	}
}
