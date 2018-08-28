package java14_io.fileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Quiz02 {
	public static void main(String[] args) {
		
		File fSrc = new File("./src/java14_io/fileStream", "Lower.txt");
		File fDest = new File("./src/java14_io/fileStream", "Upper.txt");
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		int len = -1;
		int totalLen = 0;
		byte[] buf = new byte[1024];
		
		try {
			fis = new FileInputStream(fSrc);
			fos = new FileOutputStream(fDest);
		
			while( (len=fis.read(buf)) != -1) {
				String up = new String(buf, 0, len).toUpperCase();
				buf = up.getBytes();
				fos.write(buf, 0, len);
				totalLen +=len;
			}
		} catch (FileNotFoundException e) {
			System.out.println("[err] ���� ����");
		} catch (IOException e) {
			System.out.println("[err] ����� ����");
		} finally {
				try {
					if(fis!= null)	fis.close();
					if(fos!= null) fos.close();
				} catch (IOException e) {
					System.out.println("[err] ���� ��Ʈ�� �ݱ� ����");
				}
		}
		
		if(len == -1) {
			System.out.println("����Ϸ� , " + totalLen+ " Byte");
			
		}
		
		
	}
}
