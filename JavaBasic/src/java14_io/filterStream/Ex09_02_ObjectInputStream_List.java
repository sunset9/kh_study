package java14_io.filterStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class Ex09_02_ObjectInputStream_List {
	public static void main(String[] args) {
		File file = new File("./src/java14_io/filterStream", "ObjectTest.ser");
		
		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(new FileInputStream(file));
			
			List list = (List) ois.readObject();
			
			for (int i = 0 ; i<list.size(); i++) {
				if (list.get(i) instanceof Person) {
					System.out.println(((Person)list.get(i)).name);
				}else if (list.get(i) instanceof Point) {
					System.out.println(((Point)list.get(i)).x);
				}
					
			}
			
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
