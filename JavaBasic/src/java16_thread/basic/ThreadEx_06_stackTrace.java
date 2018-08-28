package java16_thread.basic;

class Thread06 extends Thread {
	@Override
	public void run() {
		method1();
	}

	void method1() {
		method2();
	}

	private void method2() {
		method3();
	}

	private void method3() {
		try {
			throw new Exception();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}


public class ThreadEx_06_stackTrace {
	public static void main(String[] args) {
		
		// 스택 트레이스 확인하기
		
		new Thread06().start(); // 새로운 스레드
		
		new Thread06().method1(); // Main 스레드
	}
	
}
