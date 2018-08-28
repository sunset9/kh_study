package java16_thread.synchronize;

class SyncTest02 extends Thread{
	int total = 0;
	
	@Override
	public void run() { // �������� Ȱ��ȭ ������
		
		synchronized (this) {
			for(int i = 1;i<=3;i++) {
				total += i;
				System.out.println(i + " �� ���ϱ�");
			}
			
			notify();
		}
	}
}

public class WaitNotifyEx_02 {
	public static void main(String[] args) {
		
		SyncTest02 st = new SyncTest02();
		
		st.start();
		
		// �Ӱ� ����
		synchronized( st ) {
			try {
				st.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		// ����ȭ���� ������ 1~100 ���ϱ� ���� total�����
		System.out.println("�� ��: " + st.total);
	}
}
