package java15_network.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {
	public static void main(String[] args) {
		
		ServerSocket servSock = null; // 서버 리슨 소켓
		Socket sock = null; // 서버 통신 소켓
		
		BufferedReader br = null; // 입력 스트림
		
		try {
			servSock = new ServerSocket(10005);
			System.out.println("++ 서버 소켓 생성 ++");
			
			System.out.println("Listening....");
			sock = servSock.accept(); // Listen
			System.out.println("클라이언트 연결됨");
			
			// 데이터 통신
			br = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			
			String in = br.readLine();
			System.out.println(">> 전송데이터: " + in);
			
		} catch (IOException e) {
			// 서버 리슨 소켓 생성 실패 
			// accept() 실패 -> 통신 소켓 생성 실패
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
