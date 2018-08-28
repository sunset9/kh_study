package java16_thread.caht1on1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Receiver_1on1 extends Thread{
	private Socket sock;
	private BufferedReader reader;
	private PrintWriter writer;
	
	public Receiver_1on1(Socket sock) {
		this.sock = sock;
		
		try {
			reader = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			writer = new PrintWriter(System.out, true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		String in = null;
		try {
			while ((in = reader.readLine()) != null) {
				if(in.equals("/EXIT") ) {
					System.out.println("** 상대방이 대화를 종료하셨습니다. **");
					break;
				}
				System.out.print("받은 메세지: ");
				writer.println(in);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(reader != null) reader.close();
				if(writer != null) writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
