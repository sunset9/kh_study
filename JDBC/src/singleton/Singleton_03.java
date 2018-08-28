package singleton;

// 사용되는 시점에 인스턴스를 생성할 수 있도록
// getInstance() 메소드를 수정
public class Singleton_03 {
	
	// 객체 변수 선언
	private static Singleton_03 instance;
	
	// private 생성자 - 외부생성 불가
	private Singleton_03() {
	}
	
	// 객체 반환
	// 멀티쓰레드 환경에서는 동시에 접근 시 잘못하면 인스턴스 여러개 생길 수도 있다. (싱글톤 깨짐)
	// syschronize 키워드 추가 시 해결
	// 동기화 처리해주면 단점이 또 생김 -> 싱글톤의 장점은 하나를 생성해놓고 빠르게 가져가서 쓰는 건데
	// 동기화 되어 있으면 여러 쓰레드가 접근할 때 순서를 지켜야해서 느려짐 
	// -> 그냥 동기화처리 안하는게 나음 , 해당 메소드의 첫 호출이 동시에 불려지는 확률이 적음. 감안할 수 있음.
	public static Singleton_03 getInstance() {
		
		// getInstance()를 호출할 때까지 객체생성을 미룸
		// 두 번째 호출 이후부터는 만들어진 객체를 반환
		if(instance == null) {
			try {
				instance = new Singleton_03();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		return instance;
	}
}


