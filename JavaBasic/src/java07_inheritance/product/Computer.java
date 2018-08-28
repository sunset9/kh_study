package java07_inheritance.product;

public class Computer extends Product{

	public Computer(String model, int price) {
		super(model, price);
	}

	@Override
	public void out() {
		System.out.println("Computer");
	}

}
