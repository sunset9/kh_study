package java06_class.Constructor;

public class Car {
	private String model;
	private String color;

	// constructor
	public Car(String model, String color) {
		this.model = model;
		this.color = color;
	}

	public void display() {
		System.out.println("Car >> ¸ðµ¨: " + model + ", »ö»ó: " + color);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
