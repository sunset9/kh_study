package java09_innerClass.quiz;

public class Taxi implements Fare{

	@Override
	public void calc(int distance) {
		System.out.printf("%dm�� �������� �� ����� %d�� �Դϴ�.",distance, 2500 * FEE * 2);
	}

}
