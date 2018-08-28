package java09_innerClass;

public class Outer {
	public int num = 10; // �ν��Ͻ� ����
	public MemberInner mi = new MemberInner();
	
	public void print() {
		System.out.println("��� �޼ҵ�");
	}
	
	// -------------- ���(�ν��Ͻ�)��ø Ŭ����
	public class MemberInner{
		public int num = 20;
		
		public void print() {
			System.out.println("��� ��ø Ŭ����");
		}
	}
	public static int staticNum = 30; //���� ����
	
	// -------------- ���� ��ø Ŭ����
	public static class StaticInner{
		static int num = 40;
		
		public static void out() {
			System.out.println("���� ��ø Ŭ����");
		}
	}
	// ��� �޼ҵ�
	public void out() {
		int num = 50; //��������
		
		// -------------- ���� ��ø Ŭ����
		class LocalInner{
			int num = 60;
			public void out() {
				System.out.println("���� ��ø Ŭ����");
			}
		}
		
		LocalInner li = new LocalInner();
		System.out.println(li.num);
		li.out();
	}
	
}
