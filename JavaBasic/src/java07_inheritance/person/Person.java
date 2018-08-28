package java07_inheritance.person;

import java07_inheritance.product.Product;

public class Person {
	private String name;
	private int money;
	private Product prod ;
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}

	public void buy(Product prod) {
		this.prod = prod;
		money -=prod.getPrice();
		
		System.out.printf("%s���� %d���� �����ϰ� %s ������\n", 
				name, prod.getPrice(), prod.getModel());
		System.out.printf("[�ܾ�] %d��\n", money);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
}
