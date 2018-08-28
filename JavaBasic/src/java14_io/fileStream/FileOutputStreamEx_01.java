package java14_io.fileStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx_01 {
	public static void main(String[] args) {
		
		// 출력 대상 파일
		File file = new File("./src/java14_io/fileStream", "Result");
		
		// 파일 출력 스트ㄹ;ㅁ 선언
		FileOutputStream fos = null;
		
		byte[] buf = "안녕 자바".getBytes() ;
				
		try {
			// 파일 객체 생성
			// 예외처리  필수
//			fos = new FileOutputStream(file); // 덮어쓰기
			fos = new FileOutputStream(file,true); // 추가모드
			
			fos.write(buf, 0, buf.length);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
				try {
					if(fos != null)
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		
		
	}
}
