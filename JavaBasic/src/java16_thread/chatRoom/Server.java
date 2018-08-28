package java16_thread.chatRoom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class Server {
	
	private static HashMap<String, PrintWriter> userInfo;
	private static ServerSocket servSock;
	private static Socket sock;
	private final int PORT = 9988;	
	
	public Server() {
		try {
			System.out.println("++ 서버 생성 ++");
			servSock = new ServerSocket(PORT);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		userInfo = new HashMap<>();
	}
	
	public static void main(String[] args) {
		new Server();
		
		while(true) {
			try {
				sock = servSock.accept();
				new ClientManager(sock).start();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void setUserInfo(String userID, PrintWriter writer) {
		userInfo.put(userID, writer);
	}

	public static void removeUserInfo(String userID) {
		userInfo.remove(userID);
	}
	
	public static HashMap<String, PrintWriter> getUserInfo() {
		return userInfo;
	}
	
}
