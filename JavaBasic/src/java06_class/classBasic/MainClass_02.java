package java06_class.classBasic;

public class MainClass_02 {

	public static void main(String[] args) {

		ClassEx_02 ce; //��ü ����
		ce = new ClassEx_02(); // ��ü ����, �ν��Ͻ�ȭ
		
//		System.out.println(ce.num1);
		System.out.println(ce.num2);
		System.out.println(ce.num3);
		System.out.println(ce.num4);
		
		ce.setNum1(123);
		System.out.println( ce.getNum1());
		
	}

}
