package java14_io.charStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy2 {
	public static void main(String[] args) {
		
		// 파일 객체 (입출력 대상)
		File src = new File("./src/java14_io/charStream/Source.txt");
		File dest = new File("./src/java14_io/charStream/Dest.txt");
	
		// 입출력 스트림 선언
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		// 입출력 보조 변수
		String str = null; // 입력한 문자열
		int tot = 0; // 입출력 문자 수
		
		try {
			// 입출력 스트림 생성
			br = new BufferedReader(new FileReader(src));
			bw = new BufferedWriter(new FileWriter(dest));
			
			// 입출력
			while( (str=br.readLine()) != null ) { //입력
				tot += str.length(); //출력 문자수 연산
				
				bw.write(str); // 출력
				bw.newLine(); // 개행
				
				bw.flush(); // 출력 내보내기
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

		// 개행을 제외한 순수한 문자 수를 구할 수 있다
		// 개행을 제외한 문자 수 : 4054 개
		System.out.println("복사한 총 문자 수 : " + tot);

		System.out.println("+ + + 프로그램 정상 종료 + + +");
	}
}










