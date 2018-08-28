package java16_thread.basic;

class Thread01 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Thread: " + i);
			
			try {
				Thread.sleep(0); // 스레드를 멈춤 (인터럽트를 걸어줌)
			} catch (InterruptedException e) {	}
		}
	}
}
/* 
 쓰레드가 처음 실행될 땐
 이것저것 준비작업으로 인해 첫 시작이 조금 느린 경우도 있음.
 나중엔 JVM 이 해당 기능을 캐싱하기 때문에
 같은 동작이 호출되면 처음보단 더 빨리 기능을 수행하기 시작함 
 */
public class ThreadEx_01_classThread {
	public static void main(String[] args) {
		Thread01 th01 = new Thread01();
		th01.start(); // Thread01이 가진 run 메소드가 스레드화되어 동작 // 스레드 실행
//		th01.run(); // run메소드 호출(스레드 아님 -> Main 스레드가 동작시키는 것) // 동작을 위한 메소드 아님.
		
		Thread01 th02 = new Thread01();
		th02.start();
		
		new Thread01().start();
		
		for (int i = 0; i < 100; i++) {
			System.out.println("Main: " + i);
			
			try {
				Thread.sleep(100); // 스레드를 멈춤 (인터럽트를 걸어줌)
			} catch (InterruptedException e) {	}
		}
	}
}
