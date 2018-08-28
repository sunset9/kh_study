package java14_io.byteStream;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx_01_read {
	public static void main(String[] args) {
		InputStream is;

		is = System.in;

		// read()

		int in;
//		in = is.read();

		StringBuffer sb = new StringBuffer();

		System.out.println("<< 입력대기중..>>");
		try {
			while ((in = is.read()) != -1) {
				sb.append((char) in);

			}
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println("['입력실패]");
		} finally {
			try {
				if (is != null)
					is.close();
			} catch (IOException e) {
//				e.printStackTrace();
				System.out.println("['딛기실패]");
			}
		}

		System.out.println("출력: " + sb);

	}
}
