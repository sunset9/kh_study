package java15_network.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	public static void main(String[] args) {
		
		ServerSocket servSock = null; // ���� ���� ����
		Socket sock = null; // ���� ��� ����
		
		BufferedReader br = null; // �Է� ��Ʈ��
		PrintWriter out = null;
		
		try {
			servSock = new ServerSocket(10005);
			System.out.println("++ ���� ���� ���� ++");
			
			System.out.println("Listening....");
			sock = servSock.accept(); // Listen
			
			System.out.println("Ŭ���̾�Ʈ �����");
			
			// ������ ���
			br = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			out = new PrintWriter(sock.getOutputStream());
			
			String in = br.readLine();
			System.out.println(">> ���۹��� ������: " + in);
			
			//echo
			out.println(in);
			
		} catch (IOException e) {
			// ���� ���� ���� ���� ���� 
			// accept() ���� -> ��� ���� ���� ����
			e.printStackTrace();
		} finally {
			try {
				if(out!=null) out.close();
				if(br!=null) br.close();
				if(sock!=null) sock.close();
				if(servSock!=null) servSock.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}

