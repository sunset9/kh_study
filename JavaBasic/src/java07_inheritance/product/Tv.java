package java07_inheritance.product;

public class Tv extends Product {

	public Tv(String model, int price) {
		super(model, price);
	}
	
	@Override
	public void out() {
		System.out.println("Tv");
	}

}
