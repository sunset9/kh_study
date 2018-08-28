package java16_thread.synchronize;

class SyncTest02 extends Thread{
	int total = 0;
	
	@Override
	public void run() { // 스레드의 활성화 시작점
		
		synchronized (this) {
			for(int i = 1;i<=3;i++) {
				total += i;
				System.out.println(i + " 값 더하기");
			}
			
			notify();
		}
	}
}

public class WaitNotifyEx_02 {
	public static void main(String[] args) {
		
		SyncTest02 st = new SyncTest02();
		
		st.start();
		
		// 임계 영역
		synchronized( st ) {
			try {
				st.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		// 동기화되지 않으면 1~100 더하기 전에 total출력함
		System.out.println("총 합: " + st.total);
	}
}
