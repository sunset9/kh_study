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
		
		// ���� ��ü (����� ���)
		File src = new File("./src/java14_io/charStream/Source.txt");
		File dest = new File("./src/java14_io/charStream/Dest.txt");
	
		// ����� ��Ʈ�� ����
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		// ����� ���� ����
		String str = null; // �Է��� ���ڿ�
		int tot = 0; // ����� ���� ��
		
		try {
			// ����� ��Ʈ�� ����
			br = new BufferedReader(new FileReader(src));
			bw = new BufferedWriter(new FileWriter(dest));
			
			// �����
			while( (str=br.readLine()) != null ) { //�Է�
				tot += str.length(); //��� ���ڼ� ����
				
				bw.write(str); // ���
				bw.newLine(); // ����
				
				bw.flush(); // ��� ��������
			}
			
		} catch (FileNotFoundException e) {
			// ������ ���ų� ��ΰ� �߸� ������ ���
			e.printStackTrace();
		} catch (IOException e) {
			// ����� ����
			e.printStackTrace();
		} finally {
			try {
				// ���� �ݱ�
				if(bw!=null)	bw.close();
				if(br!=null) 	br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} 

		// ������ ������ ������ ���� ���� ���� �� �ִ�
		// ������ ������ ���� �� : 4054 ��
		System.out.println("������ �� ���� �� : " + tot);

		System.out.println("+ + + ���α׷� ���� ���� + + +");
	}
}










