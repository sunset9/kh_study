package java15_network.socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class FileClient {
	public static void main(String[] args) {
		
		Socket sock = null;
		
		File file = new File("./src/java15_network/socket", "Lighthouse.jpg");
//		File file = new File("./src/java15_network/socket", "Source.txt");
		
		BufferedReader br = null;
//		PrintWriter pw = null;
		BufferedWriter bw = null;
		
		char[] cbuf = new char[1024];
		int len = -1;
		
		try {
			System.out.println("++ Ŭ���̾�Ʈ ++");
			sock = new Socket("localhost", 10005);
//			sock = new Socket("192.168.30.56", 8558);
			System.out.println("���� ����");
			
			br= new BufferedReader(new FileReader(file));
//			pw = new PrintWriter(sock.getOutputStream());
			bw = new BufferedWriter(new OutputStreamWriter(sock.getOutputStream()));
			
			System.out.println("���� ������..");
			while ( (len = br.read(cbuf)) != -1) {
				bw.write(cbuf, 0, len);
			}
			System.out.println("<<���� ���� �Ϸ�>>");
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bw != null) bw.close();
				if(br != null) br.close();
				if(sock != null) sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("�� ����: " + file.length() + " byte");	
				
	}
}
