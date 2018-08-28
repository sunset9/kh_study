package java15_network.socket;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.ByteBuffer;

public class ImageFileServer {
	public static void main(String[] args) {

		ServerSocket servSock = null;
		Socket sock = null;
		
		
		BufferedOutputStream bw = null;
		DataInputStream dis = null;
		
		byte[] buf = new byte[1024];
		int len = -1;
		int totalLen = 0;
	
		try {
			servSock = new ServerSocket(10005);
			System.out.println("++ 서버 생성 ++");
			
			System.out.println("클라이언트 기다리는 중..");
			sock = servSock.accept();
			System.out.println("연결 성공");
		
			dis = new DataInputStream(sock.getInputStream());
					
			System.out.println("파일 전송 받는 중...");
			String fileName = "copy_" + dis.readUTF();
			
			File file = new File("./src/java15_network/socket", fileName);
			bw = new BufferedOutputStream(new FileOutputStream(file)); 
			
			while( (len = dis.read(buf)) != -1 ) {
				bw.write(buf, 0 , len);
				totalLen +=len;
			}
			System.out.println("<<파일 쓰기 완료>>");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(dis!= null) dis.close();
				if(bw!= null) bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		System.out.println("총 길이: " + totalLen + " byte");
	}
}
