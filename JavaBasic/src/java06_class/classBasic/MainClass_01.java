package java06_class.classBasic;

public class MainClass_01 {

	public static void main(String[] args) {
		
		ClassEx_01 ce; // ��ü ���� ����
		
		ce = new ClassEx_01(); //ClassEx ��ü ����
		
		// ����ʵ� �ʱ�ȭ(����)
		ce.num = 100;
		ce.str = "Apple";
		
		// ����޼ҵ� ȣ��
		ce.display();
		
		
		ClassEx_01 ce2 = new ClassEx_01();
		
	}

}
