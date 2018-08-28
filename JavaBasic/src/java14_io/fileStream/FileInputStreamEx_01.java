package java14_io.fileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx_01 {
	public static void main(String[] args) {
		
		// 입력 대상 파일
		File file = new File("./src/java14_io/fileStream","Hello");
//		System.out.println(file.exists());
		
		FileInputStream fis = null;
		
		int len = -1; //한번에 입력받은 길이
		StringBuffer sb = new StringBuffer(); // 최종 입력
		byte[] buf = new byte[1024]; // 임시버퍼
		
		try {
			// 파일 입력 스트립 생성
			fis = new FileInputStream(file);
			
			// EOF 까지 읽어서 읽은 만큼 sb에 문자열로 저장
			while( (len=fis.read(buf)) != -1) {
				sb.append( new String(buf,0, len));
			}
		} catch (FileNotFoundException e) {
			System.out.println("[err] 파일 없음");
//			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[err] 입출력 문제 발생");
//			e.printStackTrace();
		} finally {
			try {
				if(fis != null) fis.close(); // 파일 닫기
			} catch (IOException e) {
				System.out.println("[err] 파일 닫기 실패");
//				e.printStackTrace();
			}
		}
		
		
		System.out.println(">>출력 <<\n" + sb );
	}
}
