package singleton;

//����
//1. �ν��Ͻ�ȭ�ϸ鼭 �߰� �۾��� �� �� ����(����ó���Ұ�)
//2. �ν��Ͻ��� ������� �ʾƵ� ������ ���´�.

// 01������ Ʋ���� 02������ �´ٴ� ���� �ƴ϶� 01������ �̽� �ϳ��� �ذ��ϴ� ����� �����ϴ� ��. 
public class Singleton_02 {
	
	// ��ü ���� ����
	private static Singleton_02 instance;
	
	// static �ʱ�ȭ ��� - Ŭ���� ���� �ʱ�ȭ
	static {
		try {
			//��ü ����
			instance = new Singleton_02();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// private ������ - �ܺλ��� �Ұ�
	private Singleton_02() {
	}
	
	// ��ü ��ȯ
	public static Singleton_02 getInstance() {
		return instance;
	}
}


