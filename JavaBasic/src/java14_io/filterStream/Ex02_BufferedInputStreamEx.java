package java14_io.filterStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Ex02_BufferedInputStreamEx {
	public static void main(String[] args) {
		// 파일 객체
		File file = new File("src/java14_io/filterStream", "Source.txt");
		
//		System.out.println(file.exists());
		
		// 파일 입력 스트림 객체 선언
		FileInputStream fis = null; // 1차스트림
		BufferedInputStream bis = null; // 2차스트림
		
		// 파일 입력 보조 변수
		byte[] buf = new byte[1024];
		int len = -1;
		
		
		try {
			// 파일 입력 스트림 개설
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			
			while( (len = bis.read(buf)) != -1 ){
				System.out.print(new String(buf, 0, len));
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("[err] Not Found File");
		} catch (IOException e) {
			System.out.println("[err] File In/Output Failed");
		} finally {
				try {
					// clsoe 순서. bis -> fis
					if(bis!=null) bis.close();
					if(fis!=null) fis.close();
				} catch (IOException e) {
					System.out.println("[err] Close Failed");
				}
		}
		
		
		 
		
	}
}

