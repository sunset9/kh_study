package java06_class.overloading;

public class Overload_01 {
	private int x;
	private int y;
	
	public void display() {
		System.out.printf("(%d, %d)\n", x, y);
	}
	
	public void display(int x, int y) {
		this.x= x;
		this.y = y;
//		System.out.printf("(%d, %d)\n", this.x, this.y);
		display();
	}
	
	public void display(double d) {}
	public void display(String s) {}
	
	public int display(int i) {
		return 0;
	}
//	public void display(int i) {
//		
//	}
}
