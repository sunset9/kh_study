package java16_thread.basic;

import java.util.Random;

public class ThreadEx_03_test extends Thread {
	
	private int idx; //스레드 인덱스
	
	public ThreadEx_03_test(int idx) {
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
//		new ThreadEx_03_test().start(); //run, main메소드가 동시에 실행
		
		System.out.println("Main 스레드 시작");
		
		for(int i=0; i<10; i++) {
			new ThreadEx_03_test(i).start();
		}
		
		System.out.println("Main 스레드 끝");
	}
}
