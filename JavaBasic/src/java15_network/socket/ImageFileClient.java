package java15_network.socket;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ImageFileClient {
	public static void main(String[] args) {
		
		Socket sock = null;
		
		File file = new File("./src/java15_network/socket", "Lighthouse.jpg");
//		File file = new File("./src/java15_network/socket", "Source.txt");
		
//		BufferedReader br = null;
//		PrintWriter pw = null;
//		BufferedWriter bw = null;
		BufferedInputStream bis = null;
		DataOutputStream dos = null;
		
//		char[] cbuf = new char[1024];
		
		int len = -1;
		byte[] buf = new byte[1024];
		int v;
		int totalLen = 0;
		long start = 0;
		long end = 0;
		
		try {
			System.out.println("++ Ŭ���̾�Ʈ ++");
			sock = new Socket("localhost", 10005);
//			sock = new Socket("192.168.30.56", 8558);
			System.out.println("���� ����");
			
			bis = new BufferedInputStream(new FileInputStream(file));
//			dos = new DataOutputStream(sock.getOutputStream());
			dos = new DataOutputStream(new BufferedOutputStream(sock.getOutputStream()));
			
			System.out.println("���� ������..");
			
			start = System.currentTimeMillis();
			dos.writeUTF(file.getName());
			while ( (len = bis.read(buf)) != -1) {
				dos.write(buf, 0, len);
				totalLen +=len;
			}
			end = System.currentTimeMillis();
			System.out.println("<<���� ���� �Ϸ�>>");
			System.out.println("���۽ð�: " + ((end - start)/(double)1000));
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bis != null) bis.close();
				if(dos != null) dos.close();
				if(sock != null) sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("�� ����: " + totalLen + " byte");	
				
	}
}
