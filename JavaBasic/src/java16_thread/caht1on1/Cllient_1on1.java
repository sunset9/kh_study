package java16_thread.caht1on1;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cllient_1on1 {
	public Cllient_1on1() {
		Socket sock = null;
		
		try {
			sock = new Socket("localhost", 10005);
			System.out.println("서버 접속 성공");
			
			System.out.println("--- 채팅 시작 ---");
			chat(sock);
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void chat(Socket sock) {
		new Sender_1on1(sock).start();
		new Receiver_1on1(sock).start();
	}
	
	public static void main(String[] args) {
		new Cllient_1on1();
	}
}
