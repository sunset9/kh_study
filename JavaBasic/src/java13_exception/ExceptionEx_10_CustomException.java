package java13_exception;

class CheckEven{
	public void check(int num) throws EvenException {
		if( num % 2 != 0) {
			throw new EvenException();
		}
		System.out.println("짝수입니다.");
	}
}

class EvenException extends Exception{
	@Override
	public String getMessage() {
		return "홀수 입력";
	}
}

public class ExceptionEx_10_CustomException {
	public static void main(String[] args) {
		
		// 짝수 판별 개체
		CheckEven ce = new CheckEven();
		
		try {
			ce.check(13); // 예외상황
						  // "홀수 입력!!" - 예외 메세지 출력
		} catch (EvenException e) {
			e.printStackTrace();
		} 
		try {
			ce.check(12); // 정상상황
						  //"짝수 입니다." - 문구 출력
		} catch (EvenException e) {
			e.printStackTrace();
		} 
		
		
	}
}
