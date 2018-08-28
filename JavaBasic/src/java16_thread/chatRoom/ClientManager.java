package java16_thread.chatRoom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.HashMap;

public class ClientManager extends Thread{
	private BufferedReader reader;
	private PrintWriter writer;
	private String userID;
	
	public ClientManager(Socket sock) {
		try {
			reader = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			writer = new PrintWriter(sock.getOutputStream(), true);
		} catch (IOException e) {
			e.printStackTrace();
		}
		//----test
//		System.out.println(sock.getInetAddress() + " �α���");
	}
	
	@Override
	public void run() {
		String in;
		while(true) {
			try {
				in = reader.readLine();
				
				//null �� ������ ��� -> ���� ����
				if(in == null || in.equals("null") || in.equals("/EXIT")) {
					Server.removeUserInfo(userID);
					writer.println("/EXIT");
					broadCast("# " + userID + "������ �����ϼ̽��ϴ�. ", Server.getUserInfo());
					break;
				}
				
				// Ŭ���̾�Ʈ�� ���̵� ���� �޴� ���
				if(in.contains("_ID_IS_")) {
					String[] splitArr = in.split("_ID_IS_");
					userID = splitArr[splitArr.length -1]; 
					broadCast("# " + userID + "������ ��ȭ�� �����ϼ̽��ϴ�.", Server.getUserInfo());
					// userInfo MAP�� ����� ���� ����
					Server.setUserInfo(userID, writer);
					continue;
				}
				
				// ����� �޼����� �޴� ���
				broadCast(userID + ">> " + in, Server.getUserInfo());
				
			} catch (IOException e) {
				if(userID.equals("null")) {
					break;
				}
				System.out.println("! " + userID + "������� ������ ������ϴ�.");
				break;
			}
		}
	}
	
	public void broadCast(String str, HashMap<String, PrintWriter> userInfo) {
		System.out.println(str); // ����ȭ�鿡 ���
		for(String key : userInfo.keySet()) {
			if (key == userID) {
				continue;
			}
			(userInfo.get(key)).println(str); // �ٸ� Ŭ���̾�Ʈ���� ����
		}
		
	}
}
