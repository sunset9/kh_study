package java15_network.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {
	public static void main(String[] args) {
		
		ServerSocket servSock = null; // ���� ���� ����
		Socket sock = null; // ���� ��� ����
		
		BufferedReader br = null; // �Է� ��Ʈ��
		
		try {
			servSock = new ServerSocket(10005);
			System.out.println("++ ���� ���� ���� ++");
			
			System.out.println("Listening....");
			sock = servSock.accept(); // Listen
			System.out.println("Ŭ���̾�Ʈ �����");
			
			// ������ ���
			br = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			
			String in = br.readLine();
			System.out.println(">> ���۵�����: " + in);
			
		} catch (IOException e) {
			// ���� ���� ���� ���� ���� 
			// accept() ���� -> ��� ���� ���� ����
			e.printStackTrace();
		} finally {
			try {
				if(br!=null) br.close();
				if(sock!=null) sock.close();
				if(servSock!=null) servSock.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
