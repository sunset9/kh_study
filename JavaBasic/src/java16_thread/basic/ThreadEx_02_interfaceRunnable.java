package java16_thread.basic;

class Thread02 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Thread: " + i);
			
			try {
				Thread.sleep(100); 
			} catch (InterruptedException e) {	}
		}
	}
	
}

public class ThreadEx_02_interfaceRunnable {
	public static void main(String[] args) {
		
		Thread02 th01 = new Thread02();
		
		Thread thread = new Thread(th01);
		thread.start();
		
		for (int i = 0; i < 100; i++) {
			System.out.println("Main : " + i);
			
			try {
				Thread.sleep(100); 
			} catch (InterruptedException e) {	}
		}
	}
}
