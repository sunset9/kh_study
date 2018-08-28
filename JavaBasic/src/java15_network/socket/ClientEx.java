package java15_network.socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientEx {
	public static void main(String[] args) {
		
		Socket sock = null; // 클라이언트 소켓
		PrintWriter out = null; // 출력 스트림
		
		try {
			System.out.println("++ 클라이언트 실행 ++");
			// 127.0.0.1:10005 으로 접속 요청 보내기
			sock = new Socket("127.0.0.1", 10005);
//			sock = new Socket("192.168.30.56", 10005);
			
			// 출력 스트림 개설
			out = new PrintWriter(sock.getOutputStream());
			//데이터 통신
			out.println("Hello, Apple");
			
		} catch (UnknownHostException e) {
			// 잘못된 호스트
			e.printStackTrace();
		} catch (IOException e) {
			// 소켓 생성 실패
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
