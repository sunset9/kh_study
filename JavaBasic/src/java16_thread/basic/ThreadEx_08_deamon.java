package java16_thread.basic;

class Daemon2 implements Runnable {

	@Override
	public void run() {
		while(true) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) { }
			
			// 주기적으로 반복 수행할 코드
			System.out.println("\nAuto Save");
		}
	}
	
}


public class ThreadEx_08_deamon {
	public static void main(String[] args) {
		
		System.out.println("---- Main Start ----");
		
		Thread th = new Thread(new Daemon2()); // 스레드 생성
		th.setDaemon(true); // 데몬 스레드 설정
		th.start(); // 스레드 활성화
		
		// 주 스레드의 충분한 작업시간
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
