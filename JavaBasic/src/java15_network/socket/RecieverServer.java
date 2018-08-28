package java15_network.socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class RecieverServer {
	public static void main(String[] args) {
		
		ServerSocket servSock = null; // ���� ���� ����
		Socket sock = null; // ���� ��� ����
		
		BufferedReader br = null; // �Է� ��Ʈ��
		File file = new File("./src/java15_network/socket", "Dest.png");
//		BufferedWriter bw = null;
		PrintWriter out = null; // ��� ��Ʈ��
		
		try {
			servSock = new ServerSocket(10005);
			System.out.println("++ ���� ���� ���� ++");
			
			System.out.println("Listening....");
			sock = servSock.accept(); // Listen
			
			System.out.println("Ŭ���̾�Ʈ �����");
			
			// ������ ���
			br = new BufferedReader(new InputStreamReader(sock.getInputStream()));
//			bw = new BufferedWriter(new FileWriter(file));
			out = new PrintWriter(new FileWriter(file));
			
			String str;
			while( (str = br.readLine()) != null) {
				out.println(str);
			}
			out.flush();
			
		} catch (IOException e) {
			// ���� ���� ���� ���� ���� 
			// accept() ���� -> ��� ���� ���� ����
			e.printStackTrace();
		} finally {
			try {
				if(br!=null) br.close();
				if(out!=null) out.close();
				if(sock!=null) sock.close();
				if(servSock!=null) servSock.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("�� ����: " + file.length() + " byte");	
	}
}