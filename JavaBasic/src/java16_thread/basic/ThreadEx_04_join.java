package java16_thread.basic;

import java.util.Random;

public class ThreadEx_04_join extends Thread {
	
	private int idx; //������ �ε���
	
	public ThreadEx_04_join(int idx) {
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
		System.out.println("Main ������ ����");
		
		ThreadEx_04_join t1 = new ThreadEx_04_join(1);
		ThreadEx_04_join t2 = new ThreadEx_04_join(2);
		ThreadEx_04_join t3 = new ThreadEx_04_join(3);
		
		t1.start();
		t2.start();
		t3.start();

		// join() - �ٸ� �������� ���� ��ٸ���
		try {
			t1.join(); // = main�����尡 t1�޼ҵ尡 ���� �� ���� ��ٸ��ٴ� �ǹ�
//			t2.join();
//			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for(int i =0;i<10;i++) {
			System.out.println(i);
		}
		
		System.out.println("Main ������ ��");
	}
}