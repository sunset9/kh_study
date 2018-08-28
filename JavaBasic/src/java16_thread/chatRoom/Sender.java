package java16_thread.chatRoom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

// 클라이언트의 보내기용 클래스
public class Sender extends Thread{
	private BufferedReader reader;
	private PrintWriter writer;
	
	public Sender(Socket sock, String userID) {
		try {
			reader = new BufferedReader(new InputStreamReader(System.in));
			writer = new PrintWriter(sock.getOutputStream(), true);
			
			// 사용자 ID 서버로 전송
			writer.println("CLIENT_ID_IS_" + userID);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		String in; 
		try {
			while(true) {
				in = reader.readLine();
				writer.println(in);
				
				if (in == null || in.equals("/EXIT")) {
					System.out.println("** 채팅방을 떠납니다. **");
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(reader != null) reader.close();
//				if(writer != null) writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
			
	}
}
