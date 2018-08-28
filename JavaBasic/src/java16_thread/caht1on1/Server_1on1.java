package java16_thread.caht1on1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_1on1 {
	
	public Server_1on1() {
		ServerSocket servSock = null;
		Socket sock = null;
		
		try {
			System.out.println("서버 생성");
			servSock = new ServerSocket(10005);
			sock = servSock.accept();
			System.out.println("서버 접속자 정보: " + sock.getInetAddress());
			
			System.out.println("--- 채팅 시작 ---");
			chat(sock);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
		}
	}
	
	public void chat(Socket sock) {
		new Sender_1on1(sock).start();
		new Receiver_1on1(sock).start();
	}
	
	public static void main(String[] args) {
		new Server_1on1();
	}
}
