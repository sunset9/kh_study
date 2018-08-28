package java16_thread.basic;

class Daemon2 implements Runnable {

	@Override
	public void run() {
		while(true) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) { }
			
			// �ֱ������� �ݺ� ������ �ڵ�
			System.out.println("\nAuto Save");
		}
	}
	
}


public class ThreadEx_08_deamon {
	public static void main(String[] args) {
		
		System.out.println("---- Main Start ----");
		
		Thread th = new Thread(new Daemon2()); // ������ ����
		th.setDaemon(true); // ���� ������ ����
		th.start(); // ������ Ȱ��ȭ
		
		// �� �������� ����� �۾��ð�
		for(int i=0 ;i<500;i++) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print(i % 10);
		}
		
		System.out.println();
		System.out.println("---- Main End ----");
	}
}
