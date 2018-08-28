package java15_network.netClass;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Net03_URLConnection {
	public static void main(String[] args) {
		String urlStr = "https://www.oracle.com/downloads/index.html";
		
		URL url = null;
		URLConnection conn;
		
		BufferedReader reader = null;
		BufferedWriter writer = null;
		
		File file = new File("./src/java15_network/netClass", "download");
		
		
		try {
			url = new URL(urlStr);
			conn = url.openConnection();
			
			// 연결 객체로부터 스트림 얻기
			reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			writer = new BufferedWriter(new FileWriter(file));
			
			int len = -1;
			char[] cbuf = new char[1024];
			
			while( (len = reader.read(cbuf)) != -1) {
				writer.write(cbuf, 0, len);
				writer.flush();
//				System.out.print( new String(cbuf, 0, len));
			}
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(reader != null ) reader.close();
				if(writer != null ) writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
