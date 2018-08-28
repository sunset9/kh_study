package java16_thread.basic;

import java.util.Random;

public class ThreadEx_05_priority extends Thread {
	
	private int idx; //스레드 인덱스
	
	public ThreadEx_05_priority(int idx) {
		this.idx = idx;
	}
			
	@Override
	public void run() {
//		System.out.println(idx + "스레드 시작");
		
		for(int i=0; i<100; i++) {
			System.out.print(idx);
		}
		
//		System.out.println(idx + "스레드 끝");
	}
	
	public static void main(String[] args) {
		System.out.println("Main 스레드 시작");
		
		ThreadEx_05_priority t1 = new ThreadEx_05_priority(1);
		ThreadEx_05_priority t2 = new ThreadEx_05_priority(2);
		ThreadEx_05_priority t3 = new ThreadEx_05_priority(3);
		
		
		// Thread 클래스는
		// 우선순위와 ROUND ROBIN 알고리즘을
		// 이용하여 스레드를 스케쥴링한다
		
		// 우선 순위(priority) 설정
		t1.setPriority(1); // Thread.MIN_PRIOTIRY
		t2.setPriority(Thread.NORM_PRIORITY); // 5
		t3.setPriority(Thread.MAX_PRIORITY); //10

		
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
		
//		for(int i =0;i<10;i++) {
//			System.out.println(i);
//		}
		
		System.out.println("Main 스레드 끝");
	}
}