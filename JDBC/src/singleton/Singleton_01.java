package singleton;

//����
//1. �ν��Ͻ�ȭ�ϸ鼭 �߰� �۾��� �� �� ����(����ó���Ұ�)
//2. �ν��Ͻ��� ������� �ʾƵ� ������ ���´�.

public class Singleton_01 {
	// ������
	public String data = "Apple";
	
	// ��ü ���� (�������� �̸� ��������, �ܺο� �������� ����)
	// �������� ���� ������ �Ŀ� �� ������ �ʰ�, �������� �� ������ ��
	private static Singleton_01 instance = new Singleton_01();
	
	// private ������ - �ܺλ��� �Ұ�
	private Singleton_01() {
	}
	
	public static Singleton_01 getInstance() {
		return instance;
	}
}


