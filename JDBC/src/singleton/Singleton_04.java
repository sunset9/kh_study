package singleton;



public class Singleton_04 {
	// getInstance ȣ�� �� ����Ŭ������ Ȱ��ȭ
	
	// ���� Ŭ����
	private static class Singleton{
		private static final Singleton_04 instace = new Singleton_04();
	}
	
	// ��ü ��ȯ
	public static Singleton_04 getInstance() {
		return Singleton.instace;
	}
}


