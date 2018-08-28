package java15_network.netClass;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Net01_InetAddress {
	public static void main(String[] args) {
		//InetAddress - IP정보를 다루는 클래스
		
		InetAddress ip = null;
		
		try {
			// 호스트네임을 이용하여 IP정보 얻기
			ip = InetAddress.getByName("www.iei.or.kr");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		System.out.println("name: " + ip.getHostName());
		System.out.println("address: " + ip.getHostAddress());
		System.out.println("toString: " + ip);
		
		System.out.println("------");
		// IP주소를 숫자(byte[])로 반환받기
		byte[] ipAddr = ip.getAddress();
		System.out.println("getAddress: " + Arrays.toString(ipAddr));
		
		// 음수 보정 로직
		for(byte i : ipAddr) {
			System.out.print( (i<0)? i + 256 : i);
			System.out.print(".");
		}
		System.out.println();
		
		System.out.println("------");
		try {
			// 자기 자신의 호스트 정보 얻기
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
