package java16_thread.synchronize;

class SyncTest01 extends Thread{
	int total = 0;
	
	@Override
	public void run() { // �������� Ȱ��ȭ ������
		
		for(int i = 1;i<=100;i++) {
			total += i;
			System.out.println(i + " �� ���ϱ�");
		}
	}
}


public class WaitNotifyEx_01 {
	public static void main(String[] args) {
		
		SyncTest01 st = new SyncTest01();
		st.start();
		
		// ������ ��ٸ��� �޼ҵ� join()���� ����ȭ ó���ϱ�
		try {
			st.join(); // st �������� ���Ḧ main �����尡 ��ٷ���
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// ����ȭ���� ������ 1~100 ���ϱ� ���� total�����
		System.out.println("�� ��: " + st.total);
	}
}
