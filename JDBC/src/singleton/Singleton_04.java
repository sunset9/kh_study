package singleton;



public class Singleton_04 {
	// getInstance 호출 시 내부클래스가 활성화
	
	// 내부 클래스
	private static class Singleton{
		private static final Singleton_04 instace = new Singleton_04();
	}
	
	// 객체 반환
	public static Singleton_04 getInstance() {
		return Singleton.instace;
	}
}


