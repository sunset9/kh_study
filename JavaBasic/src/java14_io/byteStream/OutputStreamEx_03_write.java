package java14_io.byteStream;

import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx_03_write {
	public static void main(String[] args) {
	
		OutputStream os;
		os = System.out; // PrintStream -> OutputStream (형변환)
		
		int len = 0;
		
		byte[] buf = new byte[1024];
		buf[len++] = 65; //'A'
		buf[len++] = 66;
		buf[len++] = 67;
		buf[len++] = 10; //'\n'
		
		buf[len++] = 'H';
		buf[len++] = 'i';
		buf[len++] = '\n';
				
		try {
			os.write(buf,0,len);
			os.flush();
			
//			String str = "Hello";
//			byte[] tmp = str.getBytes();
//			
//			os.write(tmp);
//			os.write('\n');
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
		
		System.out.println("프로그램 종료");
	}
}
