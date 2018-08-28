package java15_network.socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer {
	public static void main(String[] args) {

		ServerSocket servSock = null;
		Socket sock = null;
		
//		File file = new File("./src/java15_network/socket", "Dest.txt");
		File file = new File("./src/java15_network/socket", "Dest.jpg");
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		char[] cbuf = new char[1024];
		int len = -1;
	
		try {
			servSock = new ServerSocket(10005);
			System.out.println("++ 서버 생성 ++");
			
			System.out.println("클라이언트 기다리는 중..");
			sock = servSock.accept();
			System.out.println("연결 성공");
		
			br = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			bw = new BufferedWriter(new FileWriter(file)); 
					
			System.out.println("파일 전송 받는 중...");
			while( (len = br.read(cbuf)) != -1 ) {
				bw.write(cbuf, 0, len);
			}
			
			System.out.println("<<파일 쓰기 완료>>");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bw!= null) bw.close();
				if(br!= null) br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		System.out.println("총 길이: " + file.length() + " byte");
	}
}
