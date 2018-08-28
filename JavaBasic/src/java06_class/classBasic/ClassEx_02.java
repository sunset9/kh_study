package java06_class.classBasic;

public class ClassEx_02 {

	// 접근제한자, Access Modifier
	
	// private : 해당 클래스 내에서만 접근가능
	// default : 같은 패키지에서 접근가능
	// protected : 같은 패키지 + 상속 관계의 객체 접근 가능
	// public : 모든 클래스
	
	// 접근제한자 적용 위치
	// 클래스 : public과 default 만 가능
	// 멤버필드 : 주로 private을 사용
	// 멤버메소드 : 주로 public 사용
	
	private int num1 = 10; 
	int num2 = 20; // default 접근제한자
	protected int num3  = 30;
	public int num4 = 40;
	
	
	//getter, setter 메소드
	public void setNum1(int data) { //setter
		num1 = data;
	}
	
	public int getNum1() { //getter
		return num1;
	}
}
