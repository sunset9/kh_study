package java14_io.fileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx_01 {
	public static void main(String[] args) {
		
		// �Է� ��� ����
		File file = new File("./src/java14_io/fileStream","Hello");
//		System.out.println(file.exists());
		
		FileInputStream fis = null;
		
		int len = -1; //�ѹ��� �Է¹��� ����
		StringBuffer sb = new StringBuffer(); // ���� �Է�
		byte[] buf = new byte[1024]; // �ӽù���
		
		try {
			// ���� �Է� ��Ʈ�� ����
			fis = new FileInputStream(file);
			
			// EOF ���� �о ���� ��ŭ sb�� ���ڿ��� ����
			while( (len=fis.read(buf)) != -1) {
				sb.append( new String(buf,0, len));
			}
		} catch (FileNotFoundException e) {
			System.out.println("[err] ���� ����");
//			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[err] ����� ���� �߻�");
//			e.printStackTrace();
		} finally {
			try {
				if(fis != null) fis.close(); // ���� �ݱ�
			} catch (IOException e) {
				System.out.println("[err] ���� �ݱ� ����");
//				e.printStackTrace();
			}
		}
		
		
		System.out.println(">>��� <<\n" + sb );
	}
}
