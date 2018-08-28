package java14_io.charStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class Ex03_CharStream {
	public static void main(String[] args) {

		Reader rd = new InputStreamReader(System.in);
		Writer wt = new OutputStreamWriter(System.out);
		
		BufferedReader br = new BufferedReader(rd);
		BufferedWriter bw = new BufferedWriter(wt);
		
		String in = null;
		
		try {
			while( (in = br.readLine()) !=  null) {
				bw.write(in);
				bw.newLine();
			}
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bw != null) bw.close();
				if(br != null) br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
