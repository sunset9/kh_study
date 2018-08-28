package java14_io.fileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Quiz {
	public static void main(String[] args) {
		
		File fSrc = new File("./src/java14_io/fileStream", "Source.txt");
		File fDest = new File("./src/java14_io/fileStream", "Dest.txt");
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		int len = -1;
		int totalLen = 0;
		byte[] buf = new byte[1024];
		
		try {
			fis = new FileInputStream(fSrc);
			fos = new FileOutputStream(fDest);

		
			while( (len=fis.read(buf)) != -1) {
				fos.write(buf, 0, len);
				totalLen +=len;
			}
		} catch (FileNotFoundException e) {
			System.out.println("[err] 파일 없음");
		} catch (IOException e) {
			System.out.println("[err] 입출력 문제");
		} finally {
				try {
					if(fis!= null)	fis.close();
					if(fos!= null) fos.close();
				} catch (IOException e) {
					System.out.println("[err] 파일 스트림 닫기 실패");
				}
		}
		
		System.out.println("복사완료 , " + totalLen+ " Byte");
		
		
		
	}
}
