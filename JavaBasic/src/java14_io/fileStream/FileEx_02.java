package java14_io.fileStream;

import java.io.File;

public class FileEx_02 {
	public static void main(String[] args) {
		
		// File Class
		// 파일 정보를 다루는 클래스
		
		// 절대경로로 파일 지정
//		File file = new File("D:\\workspace\\JavaBasic\\src\\java14_io\\fileStream\\Hello");
		File file2 = new File("D:\\workspace\\JavaBasic\\src\\java14_io\\fileStream", "Hello");
		
		// 상대경로로 파일 지정
		File file = new File(".\\src\\java14_io\\fileStream\\Hello");
		
		System.out.println("toString: " + file);
		System.out.println("len:" + file.length());
		System.out.println("exists: " + file.exists());
		
		System.out.println("-----------");
		System.out.println("canRead: " + file.canRead());
		System.out.println("canWrite: " + file.canWrite());
		
		System.out.println("-----------");
		System.out.println("isDirectory: " + file.isDirectory());
	}
}
