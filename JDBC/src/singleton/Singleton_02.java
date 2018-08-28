package singleton;

//단점
//1. 인스턴스화하면서 추가 작업을 할 수 없음(예외처리불가)
//2. 인스턴스를 사용하지 않아도 생성해 놓는다.

// 01예제가 틀리고 02예제가 맞다는 것이 아니라 01예제의 이슈 하나를 해결하는 방법을 제시하는 것. 
public class Singleton_02 {
	
	// 객체 변수 선언
	private static Singleton_02 instance;
	
	// static 초기화 블록 - 클래스 변수 초기화
	static {
		try {
			//객체 생성
			instance = new Singleton_02();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// private 생성자 - 외부생성 불가
	private Singleton_02() {
	}
	
	// 객체 반환
	public static Singleton_02 getInstance() {
		return instance;
	}
}


