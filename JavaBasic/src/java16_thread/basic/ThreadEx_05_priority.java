package java16_thread.basic;

import java.util.Random;

public class ThreadEx_05_priority extends Thread {
	
	private int idx; //������ �ε���
	
	public ThreadEx_05_priority(int idx) {
		this.idx = idx;
	}
			
	@Override
	public void run() {
//		System.out.println(idx + "������ ����");
		
		for(int i=0; i<100; i++) {
			System.out.print(idx);
		}
		
//		System.out.println(idx + "������ ��");
	}
	
	public static void main(String[] args) {
		System.out.println("Main ������ ����");
		
		ThreadEx_05_priority t1 = new ThreadEx_05_priority(1);
		ThreadEx_05_priority t2 = new ThreadEx_05_priority(2);
		ThreadEx_05_priority t3 = new ThreadEx_05_priority(3);
		
		
		// Thread Ŭ������
		// �켱������ ROUND ROBIN �˰�����
		// �̿��Ͽ� �����带 �����층�Ѵ�
		
		// �켱 ����(priority) ����
		t1.setPriority(1); // Thread.MIN_PRIOTIRY
		t2.setPriority(Thread.NORM_PRIORITY); // 5
		t3.setPriority(Thread.MAX_PRIORITY); //10

		
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
		
//		for(int i =0;i<10;i++) {
//			System.out.println(i);
//		}
		
		System.out.println("Main ������ ��");
	}
}