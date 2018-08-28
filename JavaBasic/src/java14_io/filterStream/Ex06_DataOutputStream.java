package java14_io.filterStream;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex06_DataOutputStream {
	public static void main(String[] args) {
		
		// 출력 파일 객체 생성
		File file = new File("./src/java14_io/filterStream", "DataTest.txt");
		
		// 데이터 출력 스트림
		DataOutputStream dos = null;
		
		try {
			// 파일 출력 스트림 -> 데이터 출력 스트림
			dos = new DataOutputStream(new FileOutputStream(file));
			
			dos.writeInt(123);
			dos.writeInt(456);
			dos.writeBoolean(true);
			dos.writeChar('T');
			dos.writeDouble(123.445);
			dos.writeUTF("hhell");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(dos != null) dos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
