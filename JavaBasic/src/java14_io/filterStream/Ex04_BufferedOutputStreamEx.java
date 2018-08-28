package java14_io.filterStream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex04_BufferedOutputStreamEx {
	public static void main(String[] args) {
		
		// ��� ��� ���� ����
		File file = new File("./src/java14_io/filterStream", "BufferedTestOut.txt");
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
				
		
		try {
//			file.createNewFile();
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			
			bos.write("Orange".getBytes());
			
		} catch (FileNotFoundException e) {
			System.out.println("[err] ���� ã�� �� ����");
		} catch (IOException e) {
			System.out.println("[err] ���� ����� ����");
		} finally {
				try {
					if(bos != null) bos.close();
					if(fos != null) fos.close();
				} catch (IOException e) {
					System.out.println("[err] close ����");
				}
		}
		
		
	}
}
