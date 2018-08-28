package java16_thread.caht1on1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Sender_1on1 extends Thread{
	private Socket sock = null;
	private BufferedReader reader = null;
	private PrintWriter writer = null;
	
	public Sender_1on1(Socket sock) {
		this.sock = sock;
		try {
			reader = new BufferedReader(new InputStreamReader(System.in));
			writer = new PrintWriter(sock.getOutputStream(), true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		String in;
		try {
			while (true) {
				in = reader.readLine();
				writer.println(in);
				
				if (in == null) {
					System.out.println("강제종료함; CTRL-Z");
					break;
				}
				if( in.equals("/EXIT") ) {
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
