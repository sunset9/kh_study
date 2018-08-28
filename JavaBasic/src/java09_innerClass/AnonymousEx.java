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
				System.out.println("익명개체 1번");
			}
		};
		an01.out();
		
		Anonymous an02 = new Anonymous() {
			@Override
			public void out() {
				System.out.println("익명개체 2번");
			}
		};
		an02.out();
		
		new Anonymous() {
			@Override
			public void out() {
				System.out.println("익명개체 3번");
			}
		}.out();
		
	}
}
