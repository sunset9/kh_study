package singleton;

// ���Ǵ� ������ �ν��Ͻ��� ������ �� �ֵ���
// getInstance() �޼ҵ带 ����
public class Singleton_03 {
	
	// ��ü ���� ����
	private static Singleton_03 instance;
	
	// private ������ - �ܺλ��� �Ұ�
	private Singleton_03() {
	}
	
	// ��ü ��ȯ
	// ��Ƽ������ ȯ�濡���� ���ÿ� ���� �� �߸��ϸ� �ν��Ͻ� ������ ���� ���� �ִ�. (�̱��� ����)
	// syschronize Ű���� �߰� �� �ذ�
	// ����ȭ ó�����ָ� ������ �� ���� -> �̱����� ������ �ϳ��� �����س��� ������ �������� ���� �ǵ�
	// ����ȭ �Ǿ� ������ ���� �����尡 ������ �� ������ ���Ѿ��ؼ� ������ 
	// -> �׳� ����ȭó�� ���ϴ°� ���� , �ش� �޼ҵ��� ù ȣ���� ���ÿ� �ҷ����� Ȯ���� ����. ������ �� ����.
	public static Singleton_03 getInstance() {
		
		// getInstance()�� ȣ���� ������ ��ü������ �̷�
		// �� ��° ȣ�� ���ĺ��ʹ� ������� ��ü�� ��ȯ
		if(instance == null) {
			try {
				instance = new Singleton_03();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		return instance;
	}
}


