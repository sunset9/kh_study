package java07_inheritance.productEx;

import java07_inheritance.person.Person;
import java07_inheritance.product.Computer;
import java07_inheritance.product.Product;
import java07_inheritance.product.Tv;

public class ProductEx {
	public static void main(String[] args) {
		
//		System.out.println("---��� �� �׽�Ʈ-----------------");
//		Computer c1 = new Computer("i7", 1000);
//		c1.out();
//		
//		Tv t1 = new Tv("Canvas", 800);
//		t1.out();
		
		
		
		System.out.println("---��� �� �׽�Ʈ-----------------");
		Product p1 = new Computer("i5", 700);
		p1.out();
		
		Product p2 = new Tv("LG", 500);
		p2.out();
		
		
		
		System.out.println("---Product �迭 �׽�Ʈ------------");
		Product[] products = new Product[5];
		int count = 0;
		
		products[count++] = new Computer("com1", 100);
		products[count++] = new Tv("tv1", 200);
		products[count++] = new Tv("tv2", 300);
		
		for(int i=0; i<count; i++)
			products[i].out();
		
		System.out.println(count+"�� ���� ����");
		
		
		
		System.out.println("---Person------------");
		Person p = new Person("Alice", 1000);
		
		Product prod = new Product(null, count) {
			
			@Override
			public void out() {
				// TODO Auto-generated method stub
				
			}
		};
		
		Product prod1 = new Tv("LG", 500);
		Product prod2 = new Computer("i5", 500);
		
		p.buy(prod1);
		p.buy(prod2);
	}
}




