package java10_api;

class Point implements Cloneable { // ���� ��ǥ
	int x; //x��ǥ
	int y; //y��ǥ
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Point (x="+x+", y="+y+")";
	}
	
	@Override
	public boolean equals(Object obj) {
		
//		System.out.println(x+", " + y);
//		System.out.println(((Point)obj).x + ", " + ((Point)obj).y);
		
		if( x == ((Point)obj).x && y == ((Point)obj).y ) {
			return true;
		}
		return false;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class ObjectEx {
	public static void main(String[] args) {
		
		Object obj = new Object();
		
		System.out.println("---toString()---");
		System.out.println(obj.toString());
		
		System.out.println(obj);
		
//		System.out.println(obj.getClass());
//		System.out.println(obj.getClass().getName());
		
		// println() �޼ҵ忡 ��ü�� �������ڷ� �ԷµǸ�
		// ��ü�� toString() ����� �ڵ����� ����Ѵ�.
		
		Point p1 = new Point(10, 20);
		System.out.println(p1);
		
		System.out.println("\n----equals()----");
		Point p2 = new Point(11, 22);
		Point p3 = new Point(11, 22);
		
		// ���� ��ü����, ���� ���������� ��
		System.out.println("p2==p3 : " + (p2==p3));
		
		// ���� �����͸� �������� ��
		System.out.println("p2.equals(p3) : " + p2.equals(p3));
		
		String str = new String("Apple");
		System.out.println("���ڿ� �����: " + "Apple".equals(str));
		
		System.out.println("���ڿ� ���Ϻ�: " + ("Apple" == str));
		
		
		System.out.println("\n----hashCode()----");
		String str1 = new String("Apple");
		String str2 = new String("Apple");
		String str3 = new String("Banana");
		String str4 = str1;
		
		System.out.println("str1: " + str1.hashCode());
		System.out.println("str2: " + str2.hashCode());
		System.out.println("str3: " + str3.hashCode());
		System.out.println("str4: " + str4.hashCode());
		
		System.out.println("----");
		System.out.println("p2: " + p2.hashCode());
		System.out.println("p3: " + p3.hashCode());
		
		System.out.println("p2: " + Integer.toHexString(p2.hashCode()));
		System.out.println("p3: " + Integer.toHexString(p3.hashCode()));
		
		System.out.println("\n----getClass()----");
		System.out.println("p1.getClass(): " + p1.getClass());
		System.out.println("obj.getClass(): " + obj.getClass());
		System.out.println("str.getClass(): " + str.getClass());

		// ��ü�� Ŭ�������� ��Ÿ������
		Class cls = p1.getClass();
		
		System.out.println("\n----clone()----");
		Point p_ori = new Point(33,44);
		
		Point p_clone1 = p_ori; // ���� ����
		Point p_clone2 = new Point(p_ori.x, p_ori.y); // �����ڸ� �̿��� ���� ����
		// clone() �̿��� ���� (���� ����)
		Point p_clone3 = null;
		try {
			p_clone3 = (Point) p_ori.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		System.out.println("p_ori: " + p_ori.hashCode());
		System.out.println("p_clone1: " + p_clone1.hashCode());
		System.out.println("p_clone2: " + p_clone2.hashCode());
		System.out.println("p_clone3: " + p_clone3.hashCode());
		
	}
}
