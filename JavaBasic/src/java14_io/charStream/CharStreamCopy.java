package java14_io.charStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamCopy {

	public static void main(String[] args) {
		File src = new File("./src/java14_io/charStream", "Source.txt");
		File dst = new File("./src/java14_io/charStream", "Dest.txt");
		
		FileReader fr = null;
		FileWriter fw = null; 
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		int len = -1;
		int totalLen = 0;
		char[] ch = new char[1024];
		
		try {
			fr = new FileReader(src);
			fw = new FileWriter(dst);
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			
			while( (len = br.read(ch)) != -1) {
				bw.write(ch , 0 , len);
				totalLen+=len;
				
				bw.flush();
			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br!=null) br.close();
				if(bw!=null) bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("totalChar: " + totalLen);
		System.out.println(dst.length());
	}

}
