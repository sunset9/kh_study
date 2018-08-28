package java14_io.filterStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Point implements Serializable{
	int x;
	int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Point (x = " + x + ", y= " + y +")";
	}
}


public class Ex08_01_ObjectOutputStream {
	public static void main(String[] args) {
		
		File file = new File("./src/java14_io/filterStream", "ObjectTest.ser");
		
		// 스트림 객체 선언
		ObjectOutputStream oos = null;

		try {
			oos = new ObjectOutputStream(new FileOutputStream(file));
			
			Point p1 = new Point(11, 22);
			Point p2 = new Point(111, 222);
			Point p3 = new Point(1111, 2222);
			
			oos.writeObject(p1);
			oos.writeObject(p2);
			oos.writeObject(p3);
			
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
