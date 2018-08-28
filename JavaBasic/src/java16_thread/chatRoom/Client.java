package java16_thread.chatRoom;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	private Socket sock;
	private final String IP = "localhost";
	private final int PORT = 9988;
	private String userID; 
	
	public Client() {
		Scanner sc = new Scanner(System.in);
		
		try {
			sock = new Socket(IP, PORT);
			
			System.out.printf("����� ID�� �Է��ϼ���: ");
			userID = sc.nextLine();
			
			new Sender(sock, userID).start();
			new Receiver(sock).start();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		new Client();
	}
}
