package java15_network.socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientEx {
	public static void main(String[] args) {
		
		Socket sock = null; // Ŭ���̾�Ʈ ����
		PrintWriter out = null; // ��� ��Ʈ��
		
		try {
			System.out.println("++ Ŭ���̾�Ʈ ���� ++");
			// 127.0.0.1:10005 ���� ���� ��û ������
			sock = new Socket("127.0.0.1", 10005);
//			sock = new Socket("192.168.30.56", 10005);
			
			// ��� ��Ʈ�� ����
			out = new PrintWriter(sock.getOutputStream());
			//������ ���
			out.println("Hello, Apple");
			
		} catch (UnknownHostException e) {
			// �߸��� ȣ��Ʈ
			e.printStackTrace();
		} catch (IOException e) {
			// ���� ���� ����
			e.printStackTrace();
		} finally {
			out.close();
			try {
				if(sock!=null) sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
