package java06_class.memberField;

public class MemberField_02 {
	
	// Ŭ���� ����, ���� ����, static ����
	private static String city = "Seoul";

	// static Ű���� ( ���� Ű���� )
	// : Ŭ������ ����� �ν��Ͻ�ȭ ���� ����� �� �ְ� ���ش�.
	// : ����ʵ�, ����޼ҵ� ��� �����
	// : �ν��Ͻ��� �ƴ� Ŭ���������� ����ǰ� �Ѵ�.
	
	// Ư�̻���
	// static�޼ҵ忡�� �ν��Ͻ� ������ ����� �� ����.
	// static�޼ҵ忡���� static ����(���� ����)�� ����ؾ��Ѵ�.
	// �Ϲݸ޼ҵ忡���� ����, �ν��Ͻ� ���� �Ѵ� ��밡��
	
	// ** main()�޼ҵ�� �����޼ҵ�
	
	public static String getCity() {
		return city;
	}

	public static void setCity(String city) {
		MemberField_02.city = city;
	}
	
}
