package java07_inheritance;

class Parent4{
	public void display() {
		System.out.println("부모 메소드");
	}
}

// final 클래스: 상속을 줄 수 없는 클래스
// final class Child4 extends Parent4{ }
class Child4 extends Parent4{
	@Override
	public final void display() {
		System.out.println("자식클래스 메소드");
	}
}

class Grand_Child4 extends Child4{
//	@Override
//	public void display() {
//		System.out.println("2번 재정의 메소드");
//	}
}

public class InheritEx_04 {
	public static void main(String[] args) {
		Grand_Child4 gc = new Grand_Child4();
		gc.display();
		
	}
}


