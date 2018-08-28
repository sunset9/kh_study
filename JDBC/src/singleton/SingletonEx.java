package singleton;

public class SingletonEx {
	public static void main(String[] args) {
		
		// new�� ��ü���� �����ʰ� �Լ��� ������ ����
		Singleton_01 s01 = Singleton_01.getInstance();
		Singleton_01 s02 = Singleton_01.getInstance();
		Singleton_01 s03 = Singleton_01.getInstance();
		Singleton_01 s04 = Singleton_01.getInstance();
		Singleton_01 s05 = Singleton_01.getInstance();
		
		// �̱��� ���� ���� (���ο� ��ü ������)
//		Singleton_01 s06 = new Singleton_01();
		
		// ���� ������ ����
		System.out.println(s01);
		System.out.println(s02);
		
		System.out.println(s01.data);
		System.out.println(s02.data);
		System.out.println(s03.data);
		System.out.println(s04.data);
		System.out.println(s05.data);
		
		System.out.println("-------------------");
		Singleton_02 s06 = Singleton_02.getInstance();
		Singleton_02 s07 = Singleton_02.getInstance();
		
		System.out.println(s06); 
		System.out.println(s07);
		
	}
}



