package java14_io.filterStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Ex07_DataInputStream {
	public static void main(String[] args) {
		
		// ��� ���� ��ü ����
		File file = new File("./src/java14_io/filterStream", "DataTest.txt");
		
		// ������ �Է� ��Ʈ��
		DataInputStream dis = null;
		
		try {
			dis = new DataInputStream(new FileInputStream(file));
			
			System.out.println(dis.readInt());
			System.out.println(dis.readInt());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readChar());
			System.out.println(dis.readDouble());
			System.out.println(dis.readUTF());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(dis!=null) dis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
