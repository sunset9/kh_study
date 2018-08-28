package java16_thread.basic;

class Daemon implements Runnable {

	@Override
	public void run() {
		for(int i =0 ;i < 100;i++) {
			System.out.println(i + " HI");
		}
	}
	
}


public class ThreadEx_07_deamon {
	public static void main(String[] args) {
		
		System.out.println("---- Main Start ----");
		
		Daemon daemon = new Daemon();
		Thread th = new Thread(daemon);
		th.setDaemon(true);
		
		th.start();
		
		System.out.println("---- Main End ----");
	}
}
