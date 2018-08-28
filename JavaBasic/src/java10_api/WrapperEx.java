package java10_api;

public class WrapperEx {
	public static void main(String[] args) {

		int i1 = 10;
		Integer iVal1 = new Integer(i1); // �ڽ�, Boxing
		Integer iVal2 = new Integer("123");
		Integer iVal3 = new Integer(123);
		System.out.println(iVal1); //toString() ȣ���(��ü�ϱ�) - ����µǰ� �ٲ�������
		
		double d1 = 123.456;
		Double dVal1 = new Double(d1); // �ڽ�
		Double dVal2 = new Double("234.567");
		System.out.println(dVal2);
		
		int i2 = iVal1.intValue(); // ��ڽ�
		double d2 = dVal1.doubleValue(); 
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		// ���� �ڽ�
		Integer iVal4 = 20;
		Double dVal3 = 333.44;
		
		// ���� ��ڽ�
		int i4 = iVal4;
		double d3 = dVal3;
		
		out(123); 
		// int -> Integer (����ڽ�)
		// Integer -> Object (�ڵ�����ȯ, �θ�Ÿ������) 
	}
	
	public static void out(Object obj) {
		System.out.println("obj: " + obj);
		// obj.toString() -> println�� ��ü ������ toString()ȣ��
		// �������ε� -> Integer
		// Integer�� toString�� �⺻Ÿ�Ը� ��ȯ
		// 123
		
	}
}
