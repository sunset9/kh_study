package java14_io.fileStream;

import java.io.File;

public class FileEx_01 {
	public static void main(String[] args) {
		
		// File Class
		// ���� ������ �ٷ�� Ŭ����
		
		File file = new File("D:/filetest.txt"); // "\\" = "/" ��� ������
		
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
