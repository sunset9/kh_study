package java14_io.filterStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ex08_02_ObjectInputStream {
	public static void main(String[] args) {
		File file = new File("./src/java14_io/filterStream", "ObjectTest.ser");
		
		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(new FileInputStream(file));
			
			Object obj1 = ois.readObject();
			Point obj2 = (Point) ois.readObject();
			Point obj3 = (Point) ois.readObject();
			
			System.out.println(obj2);
			System.out.println(obj3);
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
