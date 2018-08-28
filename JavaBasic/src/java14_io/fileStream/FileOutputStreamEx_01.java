package java14_io.fileStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx_01 {
	public static void main(String[] args) {
		
		// ��� ��� ����
		File file = new File("./src/java14_io/fileStream", "Result");
		
		// ���� ��� ��Ʈ��;�� ����
		FileOutputStream fos = null;
		
		byte[] buf = "�ȳ� �ڹ�".getBytes() ;
				
		try {
			// ���� ��ü ����
			// ����ó��  �ʼ�
//			fos = new FileOutputStream(file); // �����
			fos = new FileOutputStream(file,true); // �߰����
			
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
