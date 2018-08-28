package java15_network.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class EchoClient {
public static void main(String[] args) {
		
		Socket sock = null; // Ŭ���̾�Ʈ ����
		BufferedReader br = null;
		PrintWriter out = null; // ��� ��Ʈ��
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("++ Ŭ���̾�Ʈ ���� ++");
			// 127.0.0.1:10005 ���� ���� ��û ������
			sock = new Socket("127.0.0.1", 10005);
//			sock = new Socket("192.168.30.56", 10005);
			System.out.println("���� �����");
			
			System.out.print("�Է�: ");
			String str = sc.nextLine();
			
			// ��� ��Ʈ�� ����
			out = new PrintWriter(sock.getOutputStream());
			br = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			
			//������ ���
			out.println(str);
			out.flush();
			
			String echo = br.readLine();
			System.out.println("echo: " + echo);
			
		} catch (UnknownHostException e) {
			// �߸��� ȣ��Ʈ
			e.printStackTrace();
		} catch (IOException e) {
			// ���� ���� ����
			e.printStackTrace();
		} finally {
			out.close();
			try {
				if(br!=null) br.close();
				if(sock!=null) sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
