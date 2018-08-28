package java14_io.charStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args) {
		
		// 파일 객체 (입출력 대상)
		File src = new File(
				"./src/java14_io/charStream/Source.txt");
		File dest = new File(
				"./src/java14_io/charStream/Dest.txt");
		
		// 입출력 스트림 선언
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		// 입출력 보조 변수
		char[] cbuf = new char[1024]; // 버퍼
		int len = -1; // 1번 입력한 길이 
		int tot = 0; // 최종 입력한 길이

		try {
			// 입출력 스트림 생성
			br = new BufferedReader(new FileReader(src));
			bw = new BufferedWriter(new FileWriter(dest));
			
			// 입출력
			while( (len=br.read(cbuf)) != -1 ) { //입력
				bw.write(cbuf, 0, len); //출력
				tot += len; //출력 길이 연산
				
				bw.flush(); //출력 내보내기
			}
			
		} catch (FileNotFoundException e) {
			// 파일이 없거나 경로가 잘못 지정된 경우
			e.printStackTrace();
		} catch (IOException e) {
			// 입출력 에러
			e.printStackTrace();
		} finally {
			try {
				// 파일 닫기
				if(bw!=null)	bw.close();
				if(br!=null) 	br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} 
		
		// Source.txt는 총 크기는 4,250 바이트이다.
		// 하지만 복사된 문자수는 4230 개 로 나온다.
		// 	-> 한글이 하나의 문자로 인식되기 때문
		System.out.println("복사한 총 문자 수 : " + tot);
		System.out.println("+ + + 프로그램 정상 종료 + + +");
	}
}










