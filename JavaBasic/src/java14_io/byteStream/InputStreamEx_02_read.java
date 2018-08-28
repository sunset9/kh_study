package java14_io.byteStream;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx_02_read {
	public static void main(String[] args) {
		InputStream is;
		is = System.in;
		StringBuffer sb = new StringBuffer();
		
		int len = 0;
		byte[] buf = new byte[8];
		System.out.println("<< 입력대기중..>>");
		try {
			while((len = is.read(buf)) != -1 ) {
//				sb.append(new String(buf,0,len));
//			}
			
			String str = new String(buf, 0, len);
			sb.append(str);
			
			System.out.println("len: " + len + "B");
			System.out.println("str:" + str);
			System.out.println("--------");
			
			}
		} catch (IOException e) {
			System.out.println("['입력실패]");
		} finally {
			try {
				if (is != null)
					is.close();
			} catch (IOException e) {
				System.out.println("['닫기실패]");
			}
		}
		
		System.out.println("\n<< 출력 >> \n" + sb);

	}
}
