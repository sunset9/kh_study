package java06_class.Constructor;

public class ConstructorEx_03 {
	public static void main(String[] args) {
		Car c1 = new Car("K5", "Black");
		c1.display();

		System.out.println("------------");

		c1.setModel("¸ð´×");
		c1.setColor("White");

		System.out.println(c1.getModel());
		System.out.println(c1.getColor());
		System.out.println("------------");
		c1.display();
	}

}