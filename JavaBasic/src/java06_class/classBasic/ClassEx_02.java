package java06_class.classBasic;

public class ClassEx_02 {

	// ����������, Access Modifier
	
	// private : �ش� Ŭ���� �������� ���ٰ���
	// default : ���� ��Ű������ ���ٰ���
	// protected : ���� ��Ű�� + ��� ������ ��ü ���� ����
	// public : ��� Ŭ����
	
	// ���������� ���� ��ġ
	// Ŭ���� : public�� default �� ����
	// ����ʵ� : �ַ� private�� ���
	// ����޼ҵ� : �ַ� public ���
	
	private int num1 = 10; 
	int num2 = 20; // default ����������
	protected int num3  = 30;
	public int num4 = 40;
	
	
	//getter, setter �޼ҵ�
	public void setNum1(int data) { //setter
		num1 = data;
	}
	
	public int getNum1() { //getter
		return num1;
	}
}
