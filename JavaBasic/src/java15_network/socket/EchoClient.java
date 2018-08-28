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
		
		Socket sock = null; // 클라이언트 소켓
		BufferedReader br = null;
		PrintWriter out = null; // 출력 스트림
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("++ 클라이언트 실행 ++");
			// 127.0.0.1:10005 으로 접속 요청 보내기
			sock = new Socket("127.0.0.1", 10005);
//			sock = new Socket("192.168.30.56", 10005);
			System.out.println("서버 연결됨");
			
			System.out.print("입력: ");
			String str = sc.nextLine();
			
			// 출력 스트림 개설
			out = new PrintWriter(sock.getOutputStream());
			br = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			
			//데이터 통신
			out.println(str);
			out.flush();
			
			String echo = br.readLine();
			System.out.println("echo: " + echo);
			
		} catch (UnknownHostException e) {
			// 잘못된 호스트
			e.printStackTrace();
		} catch (IOException e) {
			// 소켓 생성 실패
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
