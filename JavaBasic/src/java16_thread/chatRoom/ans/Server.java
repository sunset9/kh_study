package java16_thread.chatRoom.ans;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class Server {
	public static void main(String[] args) {
		Server s = new Server();
		
		// 생성자의 역할을 해주는 메소드
		s.initChatRoom();
	}

	private final int PORT = 9988; // 서버 포트
	
	// 클라이언트 목록 (맵)
	// key - ClientID
	// value - Client PrintWriter
	private Map<String, PrintWriter> writerToClients;
	
	// 채팅방 서버 초기화
	public void initChatRoom() {
		// 맵 생성
		writerToClients = new HashMap<String, PrintWriter>();
		
		try {
			// 리슨 소켓 생성
			ServerSocket serv = new ServerSocket(PORT);
			
			// 연속적으로 클라이언트 받아들이기
			while(true) {
				// 클라이언트 리슨
				Socket sock = serv.accept();
				
				// 클라이언트 매니저 생성 및 스레드 활성화
				ClientManager manager = new ClientManager(sock);
				manager.start();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	class ClientManager extends Thread {
		private Socket sock; // 통신 소켓
		private String clientID; // 클라이언트 아이디
		
		public ClientManager(Socket sock) {
			this.sock = sock;
		}
		
		@Override
		public void run() {
			try {
				// 소켓 입력 스트림
				BufferedReader reader = new BufferedReader(
						new InputStreamReader(sock.getInputStream()));
				
				String msg; // 입력받은 메시지
				while(true) { // 메시지 반복 처리
					
					// 메시지 입력받고 화면에 출력(채팅 기록 남기기 : 로그)
					msg = reader.readLine();
					System.out.println(clientID+">"+msg);
					
					// 로그아웃 처리
					if(msg == null) {
						// 접속 기록 남기기
						System.out.println(clientID + " 로그아웃");

						// 맵에서 아이디를 비교하여
						// 메시지를 보낸 사람의 아이디가 아닐 경우
						// 로그아웃 메시지 전송
						for(String id : writerToClients.keySet()) {
							if(id.equals(clientID)) continue;
							
							writerToClients.get(id).println("SYSTEM : " + clientID + "님이 채팅방을 나가셨습니다.");
						}

						// 처리 종료
						break;
					}
					
					// key값이 되는 ID 에 대한 중복 처리 필요
					// 로그인 처리
					String[] res = msg.split("_ID_IS_");
					if(res.length == 2) { // && "CLIENT".equals(res[0])) {
						clientID = res[1]; // 클라이언트의 아이디 저장하기
						System.out.println(clientID + " 로그인"); // 접속기록 남기기
						
						// 맵에 접속자 추가하기
						writerToClients.put(
								clientID,	// Key
								new PrintWriter(sock.getOutputStream(), true) // Value
						);
						
						// 자신이외의 클라이언트에게 접속 메시지 보내기
						for(String id : writerToClients.keySet()) {
							if(id.equals(clientID)) continue;
							
							writerToClients.get(id).println("SYSTEM : " + clientID + "님이 채팅방을 입장하셨습니다.");
						}
						
						// 다음 메시지 처리로 넘기기
						continue;
					}
					
					// 기본 메세지 처리
					// 자신 이외의 클라이언트에게 전송해주기
					for(String id : writerToClients.keySet()) {
						if(id.equals(clientID)) continue;
						
						writerToClients.get(id).println(clientID + "> " + msg);
					}
				}
				
				// 로그아웃 시 소켓 제거
				writerToClients.remove(clientID);
				sock.close();				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}




