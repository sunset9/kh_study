package java16_thread.chatRoom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.HashMap;

public class ClientManager extends Thread{
	private BufferedReader reader;
	private PrintWriter writer;
	private String userID;
	
	public ClientManager(Socket sock) {
		try {
			reader = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			writer = new PrintWriter(sock.getOutputStream(), true);
		} catch (IOException e) {
			e.printStackTrace();
		}
		//----test
//		System.out.println(sock.getInetAddress() + " 로그인");
	}
	
	@Override
	public void run() {
		String in;
		while(true) {
			try {
				in = reader.readLine();
				
				//null 값 들어오는 경우 -> 접속 끊김
				if(in == null || in.equals("null") || in.equals("/EXIT")) {
					Server.removeUserInfo(userID);
					writer.println("/EXIT");
					broadCast("# " + userID + "유저가 퇴장하셨습니다. ", Server.getUserInfo());
					break;
				}
				
				// 클라이언트의 아이디 정보 받는 경우
				if(in.contains("_ID_IS_")) {
					String[] splitArr = in.split("_ID_IS_");
					userID = splitArr[splitArr.length -1]; 
					broadCast("# " + userID + "유저가 대화에 참여하셨습니다.", Server.getUserInfo());
					// userInfo MAP에 사용자 정보 저장
					Server.setUserInfo(userID, writer);
					continue;
				}
				
				// 평범한 메세지를 받는 경우
				broadCast(userID + ">> " + in, Server.getUserInfo());
				
			} catch (IOException e) {
				if(userID.equals("null")) {
					break;
				}
				System.out.println("! " + userID + "사용자의 접속이 끊겼습니다.");
				break;
			}
		}
	}
	
	public void broadCast(String str, HashMap<String, PrintWriter> userInfo) {
		System.out.println(str); // 서버화면에 출력
		for(String key : userInfo.keySet()) {
			if (key == userID) {
				continue;
			}
			(userInfo.get(key)).println(str); // 다른 클라이언트에게 전달
		}
		
	}
}
