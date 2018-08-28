package java14_io.charStream;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class Ex01_CharStream {
	public static void main(String[] args) {

		Reader rd = new InputStreamReader(System.in);
		Writer wt = new OutputStreamWriter(System.out);
		
		int in = -1;
		
		try {
			while( (in = rd.read()) !=  -1) {
				wt.write(in);
			}
//			wt.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rd != null) rd.close();
				if(wt != null) wt.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
