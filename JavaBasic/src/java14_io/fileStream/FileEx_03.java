package java14_io.fileStream;

import java.io.File;

public class FileEx_03 {
	public static void main(String[] args) {
		
		File file3 = new File("D:\\test\\ttt\\aaa");

		System.out.println(file3.mkdir()) ; // fail	// ������ �ܰ� �Ѱ� ����
		
		System.out.println(file3.mkdirs()); // ��� ��� ���丮 ����
	}
}
