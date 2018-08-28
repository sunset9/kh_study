package java15_network.netClass;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Net01_InetAddress {
	public static void main(String[] args) {
		//InetAddress - IP������ �ٷ�� Ŭ����
		
		InetAddress ip = null;
		
		try {
			// ȣ��Ʈ������ �̿��Ͽ� IP���� ���
			ip = InetAddress.getByName("www.iei.or.kr");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		System.out.println("name: " + ip.getHostName());
		System.out.println("address: " + ip.getHostAddress());
		System.out.println("toString: " + ip);
		
		System.out.println("------");
		// IP�ּҸ� ����(byte[])�� ��ȯ�ޱ�
		byte[] ipAddr = ip.getAddress();
		System.out.println("getAddress: " + Arrays.toString(ipAddr));
		
		// ���� ���� ����
		for(byte i : ipAddr) {
			System.out.print( (i<0)? i + 256 : i);
			System.out.print(".");
		}
		System.out.println();
		
		System.out.println("------");
		try {
			// �ڱ� �ڽ��� ȣ��Ʈ ���� ���
			//localhost
			ip = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	
		System.out.println("name: " + ip.getHostName());
		System.out.println("address: " + ip.getHostAddress());
		System.out.println("toString: " + ip);
	}
}
