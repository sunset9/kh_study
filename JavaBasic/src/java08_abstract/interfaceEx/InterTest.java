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

	// 추상메소드와 상수만 멤버로 가지는 일종의 추상클래스
	
	// 멤버필드는 public static final 이 기본설정
	// 멤버메소드는 abstract가 기본 설정
	// 해당 키워드들을 적용하지 않아도 적용된 걸로 처리됨
	
	public static final int NUM = 123;
	int MAX = 999;
	
	public void out();
	public abstract void display();
}
