package java16_thread.synchronize;

class SyncTest01 extends Thread{
	int total = 0;
	
	@Override
	public void run() { // 스레드의 활성화 시작점
		
		for(int i = 1;i<=100;i++) {
			total += i;
			System.out.println(i + " 값 더하기");
		}
	}
}


public class WaitNotifyEx_01 {
	public static void main(String[] args) {
		
		SyncTest01 st = new SyncTest01();
		st.start();
		
		// 스레드 기다리는 메소드 join()으로 동기화 처리하기
		try {
			st.join(); // st 스레드의 종료를 main 스레드가 기다려줌
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// 동기화되지 않으면 1~100 더하기 전에 total출력함
		System.out.println("총 합: " + st.total);
	}
}
