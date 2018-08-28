package java09_innerClass.quiz;

public class Taxi implements Fare{

	@Override
	public void calc(int distance) {
		System.out.printf("%dm를 운행했을 때 요금은 %d원 입니다.",distance, 2500 * FEE * 2);
	}

}
