package java14_io.filterStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex05_BufferedFileCopy {
	public static void main(String[] args) {
		
		File fSrc = new File("./src/java14_io/filterStream", "Source.txt");
		File fDest = new File("./src/java14_io/filterStream", "Dest.txt");
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		int len = -1;
		int totalLen = 0;
		byte[] buf = new byte[1024];
		
		long start = 0;
		long end = 0;
		
		start = System.currentTimeMillis();
		try {
			bis = new BufferedInputStream(new FileInputStream(fSrc));
			bos = new BufferedOutputStream(new FileOutputStream(fDest));
		
			while( (len=bis.read(buf)) != -1) {
				bos.write(buf, 0, len);
				totalLen +=len;
			}
			end = System.currentTimeMillis();
		} catch (FileNotFoundException e) {
			System.out.println("[err] 파일 없음");
		} catch (IOException e) {
			System.out.println("[err] 입출력 문제");
		} finally {
				try {
					if(bis!= null)	bis.close();
					if(bos!= null) bos.close();
				} catch (IOException e) {
					System.out.println("[err] 파일 스트림 닫기 실패");
				}
		}
		
		System.out.println("복사완료 , " + totalLen+ " Byte");
		System.out.println("소요시간: " + ((end - start) / (double)1000) + "sec");
		
	}
}
