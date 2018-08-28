package java06_class.overloading;

public class Overload_02 {

	// 데이터의 문자수를 구해서 반한
	public int getLength(int num) {
		//숫자를 문자로 바꿈
		//int 112233 -> String "112233"
		String str = String.valueOf(num);
		
		return str.length();
	}
	
	public int getLength(double num) {
		String str = String.valueOf(num);
		
		return str.length();
	}
	
	public int getLength(boolean b) {
		String str = String.valueOf(b);
		
		return str.length();
	}
}
