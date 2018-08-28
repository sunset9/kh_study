package java15_network.socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer {
	public static void main(String[] args) {

		ServerSocket servSock = null;
		Socket sock = null;
		
//		File file = new File("./src/java15_network/socket", "Dest.txt");
		File file = new File("./src/java15_network/socket", "Dest.jpg");
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		char[] cbuf = new char[1024];
		int len = -1;
	
		try {
			servSock = new ServerSocket(10005);
			System.out.println("++ ���� ���� ++");
			
			System.out.println("Ŭ���̾�Ʈ ��ٸ��� ��..");
			sock = servSock.accept();
			System.out.println("���� ����");
		
			br = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			bw = new BufferedWriter(new FileWriter(file)); 
					
			System.out.println("���� ���� �޴� ��...");
			while( (len = br.read(cbuf)) != -1 ) {
				bw.write(cbuf, 0, len);
			}
			
			System.out.println("<<���� ���� �Ϸ�>>");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bw!= null) bw.close();
				if(br!= null) br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		System.out.println("�� ����: " + file.length() + " byte");
	}
}
