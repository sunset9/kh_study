package java09_innerClass;

interface Anonymous{
	void out();
}

public class AnonymousEx {
	public static void main(String[] args) {
		Anonymous an01;
		an01 = new Anonymous() {
			@Override
			public void out() {
				System.out.println("�͸�ü 1��");
			}
		};
		an01.out();
		
		Anonymous an02 = new Anonymous() {
			@Override
			public void out() {
				System.out.println("�͸�ü 2��");
			}
		};
		an02.out();
		
		new Anonymous() {
			@Override
			public void out() {
				System.out.println("�͸�ü 3��");
			}
		}.out();
		
	}
}
