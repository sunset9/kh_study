package java16_thread.chatRoom.ans;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
	public static void main(String[] args) {
		Client c = new Client();
		c.initClient(); //클라이언트 초기화
	}

	private final String HOST = "localhost";
	private final int PORT = 9988;

	private String clientID; // 클라이언트의 아이디
	
	// 클라이언트 초기화 메소드
	public void initClient() {
		try {
			// 소켓생성, 서버에 접속하기
			Socket sock = new Socket(HOST, PORT);
			
			// Sender, Receiver 활성화
			chat(sock);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// Sender Receiver 스레드 활성화
	public void chat(Socket sock) {
		Receiver receiver = new Receiver(sock);
		receiver.start();
		
		Sender sender = new Sender(sock);
		sender.start();
	}

	// Receiver 스레드 클래스
	class Receiver extends Thread {
		private Socket sock;
		private BufferedReader reader;
		
		public Receiver(Socket sock) {
			this.sock = sock;
		}
		
		@Override
		public void run() {
			
			// 소켓 입력 -> 모니터 출력
			try {
				reader = new BufferedReader(new InputStreamReader(sock.getInputStream()));
				
				String msg;
				while( (msg = reader.readLine()) != null) {
					System.out.println(msg);
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
			
		}
	}
	
	// Sender 스레드 클래스
	class Sender extends Thread {
		private Socket sock;
		private PrintWriter writer;
		private BufferedReader reader;
		
		public Sender(Socket sock) {
			this.sock = sock;
		}
		
		@Override
		public void run() {
			try {
				// 키보드 입력 -> 소켓 출력 
				writer = new PrintWriter(sock.getOutputStream(), true);
				reader = new BufferedReader(new InputStreamReader(System.in));
				
				// 클라이언트의 아이디 입력하기
				//	ex) alice 입력하면
				//		아이디는 alice로 입력되고
				//		서버에는 CLIENT_ID_IS_alice 로 전송
				//		( CLIENT_ID_IS_ 는 임의로 설정한
				//		로그인 메시지를 나타내는 키워드 )
				System.out.print("사용할 ID를 입력하세요 : ");
				clientID = reader.readLine();
				writer.println("CLIENT_ID_IS_" + clientID);
				
				// exit를 입력하기 전까지
				// 입력된 메시지를 서버에 전송
				while(true) {
					String msg;
					msg = reader.readLine();

					if("exit".equals(msg)) {	break; }
					
					writer.println(msg);
				}
				
				writer.close();
				reader.close();
				sock.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
