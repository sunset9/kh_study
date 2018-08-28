package singleton;

//단점
//1. 인스턴스화하면서 추가 작업을 할 수 없음(예외처리불가)
//2. 인스턴스를 사용하지 않아도 생성해 놓는다.

public class Singleton_01 {
	// 데이터
	public String data = "Apple";
	
	// 객체 생성 (정적으로 미리 만들어놓고, 외부에 공개하지 않음)
	// 정적으로 만든 변수는 후에 또 만들지 않고, 만들어놓은 것 가져다 씀
	private static Singleton_01 instance = new Singleton_01();
	
	// private 생성자 - 외부생성 불가
	private Singleton_01() {
	}
	
	public static Singleton_01 getInstance() {
		return instance;
	}
}


