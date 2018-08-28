package java16_thread.basic;

class Thread01 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Thread: " + i);
			
			try {
				Thread.sleep(0); // �����带 ���� (���ͷ�Ʈ�� �ɾ���)
			} catch (InterruptedException e) {	}
		}
	}
}
/* 
 �����尡 ó�� ����� ��
 �̰����� �غ��۾����� ���� ù ������ ���� ���� ��쵵 ����.
 ���߿� JVM �� �ش� ����� ĳ���ϱ� ������
 ���� ������ ȣ��Ǹ� ó������ �� ���� ����� �����ϱ� ������ 
 */
public class ThreadEx_01_classThread {
	public static void main(String[] args) {
		Thread01 th01 = new Thread01();
		th01.start(); // Thread01�� ���� run �޼ҵ尡 ������ȭ�Ǿ� ���� // ������ ����
//		th01.run(); // run�޼ҵ� ȣ��(������ �ƴ� -> Main �����尡 ���۽�Ű�� ��) // ������ ���� �޼ҵ� �ƴ�.
		
		Thread01 th02 = new Thread01();
		th02.start();
		
		new Thread01().start();
		
		for (int i = 0; i < 100; i++) {
			System.out.println("Main: " + i);
			
			try {
				Thread.sleep(100); // �����带 ���� (���ͷ�Ʈ�� �ɾ���)
			} catch (InterruptedException e) {	}
		}
	}
}
