package java16_thread.synchronize;

class SyncData {
	int total;
	
	// total�� ��°��� ����(������ �Ϸ�� ����)
	boolean available = false;
}

class Input extends Thread {
	SyncData data;
	
	public Input(SyncData data) {
		this.data = data;
	}
	
	@Override
	public void run() {
		System.out.println("---- Input Start ----");
		
		synchronized(data) {
			for (int i = 1;i<=100;i++) {
				data.total += i;
			}
			
			data.available = true;
			data.notifyAll();
		}
		
		System.out.println("---- Input End ----");
	}
}

class Output extends Thread {
	SyncData data;
	
	public Output(SyncData data) {
		this.data = data;
	}
	
	@Override
	public void run() {
		System.out.println("---- Output Start ----");
		
		synchronized (data) {
			if( !data.available ) {
				try {
					data.wait(); // Input�� �۾���� ��ٸ���
				} catch (InterruptedException e) {	}
			}
			
			System.out.println("TOTAL: " + data.total);
		}
		
		System.out.println("---- Output End ----");
	}
}

public class WaitNotifyEx_03 {
	public static void main(String[] args) {
		SyncData data = new SyncData();
		
		Output o = new Output(data);
		Input i = new Input(data);
		
		o.start();
		i.start();
		
	}
}