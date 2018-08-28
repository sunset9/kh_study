package java14_io.fileStream;

import java.io.File;

public class FileEx_02 {
	public static void main(String[] args) {
		
		// File Class
		// ���� ������ �ٷ�� Ŭ����
		
		// �����η� ���� ����
//		File file = new File("D:\\workspace\\JavaBasic\\src\\java14_io\\fileStream\\Hello");
		File file2 = new File("D:\\workspace\\JavaBasic\\src\\java14_io\\fileStream", "Hello");
		
		// ����η� ���� ����
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
