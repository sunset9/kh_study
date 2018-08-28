package java16_thread.basic;

import java.util.Random;

public class ThreadEx_04_join extends Thread {
	
	private int idx; //스레드 인덱스
	
	public ThreadEx_04_join(int idx) {
		this.idx = idx;
	}
			
	@Override
	public void run() {
		System.out.println(idx + "스레드 시작");
		
		Random ran = new Random();
		try {
			Thread.sleep(ran.nextInt(3000)); // 최대 3초까지 sleep걸리게
		} catch (InterruptedException e) { }
		
		System.out.println(idx + "스레드 끝");
	}
	
	public static void main(String[] args) {
		System.out.println("Main 스레드 시작");
		
		ThreadEx_04_join t1 = new ThreadEx_04_join(1);
		ThreadEx_04_join t2 = new ThreadEx_04_join(2);
		ThreadEx_04_join t3 = new ThreadEx_04_join(3);
		
		t1.start();
		t2.start();
		t3.start();

		// join() - 다른 스레드의 종료 기다리기
		try {
			t1.join(); // = main스레드가 t1메소드가 끝날 때 까지 기다린다는 의미
//			t2.join();
//			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for(int i =0;i<10;i++) {
			System.out.println(i);
		}
		
		System.out.println("Main 스레드 끝");
	}
}