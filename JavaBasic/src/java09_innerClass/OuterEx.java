package java09_innerClass;

public class OuterEx {
	public static void main(String[] args) {
		Outer o = new Outer();
		System.out.println(o.num); // �ν��Ͻ� ����
		o.print(); //��� �޼ҵ�
		System.out.println("------------");
		
		Outer.MemberInner memIn;
		memIn = o.new MemberInner(); // ��ü�� ���� ������ ȣ��
		System.out.println(memIn.num);
		memIn.print();
//		System.out.println(o.mi.num);
//		o.mi.print();
		System.out.println("------------");
		
		System.out.println(Outer.staticNum); // ��������
		
		// ���� ��ø Ŭ������ �����ʵ�(��������)
		System.out.println(Outer.StaticInner.num);
		Outer.StaticInner.out(); // ������øŬ������ �����޼ҵ�
		System.out.println("------------");
		
		// ��� �޼ҵ� ȣ��
		o.out(); // ���� ��ø Ŭ���� �����ǰ� �޼ҵ� ȣ���
		
	}
		
}
