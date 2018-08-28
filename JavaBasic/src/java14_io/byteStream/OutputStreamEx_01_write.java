package java14_io.byteStream;

import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx_01_write {
	public static void main(String[] args) {
	
		OutputStream os;
		os = System.out; // PrintStream -> OutputStream (����ȯ)
		
		try {
			os.write(97); // 'a'
//			os.write(13); // '\r'
			os.write(10); // '\n'
			os.write('\n');
			
//			os.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
				try {
					if(os!= null)
						os.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		System.out.println("���α׷� ����");
	}
}
