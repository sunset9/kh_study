package java06_class.memberField;

public class MemberField_03 {

	private int num = 777; //�ν��Ͻ� ����
	private static int num2 = 555; //Ŭ���� ����
	
	public static void method() {
//		System.out.println(num); //�ν��Ͻ� ����
		System.out.println(num2); //Ŭ���� ����
	}
	
	// var -> �Ű�����, ���������� ���� ���
	public void method2(int var) {
		int num = 101; // ��������
		int num2 = 202; // ��������
		
		System.out.println(num); // ��������
		System.out.println(this.num); // �ν��Ͻ� ����
		
		System.out.println(num2); //��������
//		System.out.println(this.num2);
		System.out.println(MemberField_03.num2); // ��������
	}
}
