package java08_abstract.interfaceEx;

class ClassTest implements InterTest{

	@Override
	public void out() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
}

public interface InterTest {

	// �߻�޼ҵ�� ����� ����� ������ ������ �߻�Ŭ����
	
	// ����ʵ�� public static final �� �⺻����
	// ����޼ҵ�� abstract�� �⺻ ����
	// �ش� Ű������� �������� �ʾƵ� ����� �ɷ� ó����
	
	public static final int NUM = 123;
	int MAX = 999;
	
	public void out();
	public abstract void display();
}
