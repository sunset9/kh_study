package java07_inheritance;

class Parent4{
	public void display() {
		System.out.println("�θ� �޼ҵ�");
	}
}

// final Ŭ����: ����� �� �� ���� Ŭ����
// final class Child4 extends Parent4{ }
class Child4 extends Parent4{
	@Override
	public final void display() {
		System.out.println("�ڽ�Ŭ���� �޼ҵ�");
	}
}

class Grand_Child4 extends Child4{
//	@Override
//	public void display() {
//		System.out.println("2�� ������ �޼ҵ�");
//	}
}

public class InheritEx_04 {
	public static void main(String[] args) {
		Grand_Child4 gc = new Grand_Child4();
		gc.display();
		
	}
}


