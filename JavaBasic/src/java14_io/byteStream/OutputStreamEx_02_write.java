package java14_io.byteStream;

import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx_02_write {
	public static void main(String[] args) {
	
		OutputStream os;
		os = System.out; // PrintStream -> OutputStream (형변환)
		
		byte[] buf = new byte[1024];
		buf[0] = 65; //'A'
		buf[1] = 66;
		buf[2] = 67;
		buf[3] = 10; //'\n'
		
		buf[4] = 'H';
		buf[5] = 'i';
		buf[6] = '\n';
				
		try {
			os.write(buf);
			os.write('\n');
			os.flush();
			
			String str = "Hello";
			byte[] tmp = str.getBytes();
			
			os.write(tmp);
			os.write('\n');
			os.flush();
			
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
		
		System.out.println("프로그램 종료");
	}
}
