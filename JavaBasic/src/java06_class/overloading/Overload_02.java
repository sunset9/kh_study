package java06_class.overloading;

public class Overload_02 {

	// �������� ���ڼ��� ���ؼ� ����
	public int getLength(int num) {
		//���ڸ� ���ڷ� �ٲ�
		//int 112233 -> String "112233"
		String str = String.valueOf(num);
		
		return str.length();
	}
	
	public int getLength(double num) {
		String str = String.valueOf(num);
		
		return str.length();
	}
	
	public int getLength(boolean b) {
		String str = String.valueOf(b);
		
		return str.length();
	}
}
