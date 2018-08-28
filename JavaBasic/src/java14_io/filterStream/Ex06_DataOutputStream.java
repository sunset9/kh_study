package java14_io.filterStream;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex06_DataOutputStream {
	public static void main(String[] args) {
		
		// ��� ���� ��ü ����
		File file = new File("./src/java14_io/filterStream", "DataTest.txt");
		
		// ������ ��� ��Ʈ��
		DataOutputStream dos = null;
		
		try {
			// ���� ��� ��Ʈ�� -> ������ ��� ��Ʈ��
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
