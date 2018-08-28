package java14_io.filterStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
class Person implements Serializable {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {

		return "name: " + name + ", age: " + age;
	}
}
public class Ex09_01_ObjectInputStream_List {
	public static void main(String[] args) {
		File file = new File("./src/java14_io/filterStream", "ObjectTest.ser");
		
		// 스트림 객체 선언
		ObjectOutputStream oos = null;

		try {
			oos = new ObjectOutputStream(new FileOutputStream(file));
			
			List list = new ArrayList();
			
			list.add(new Point(11, 22));
			list.add(new Person("Alice", 20));
			list.add(new Point(525,666));
			list.add(new Person("Bob", 25));
			list.add(new Person("Kasulit", 29));
			
			oos.writeObject(list);
			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("에러");
		} finally {
			try {
				if(oos!=null) oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
