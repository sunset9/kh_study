package java16_thread.chatRoom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

//클라이언트의 받기용 클래스
public class Receiver extends Thread{
	
	private BufferedReader reader;
	private PrintWriter writer;
	
	public Receiver(Socket sock) {
		try {
			reader = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			writer = new PrintWriter(System.out, true);
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
				if (in == null || in.equals("/EXIT")) {
					break;
				}
				writer.println(in);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(reader != null) reader.close();
				if(writer != null) writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
