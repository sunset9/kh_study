package java15_network.netClass;

import java.net.MalformedURLException;
import java.net.URL;

public class Net02_URL {
	public static void main(String[] args) {
//		String urlStr = "https://www.oracle.com/downloads/index.html";
		String urlStr = "https://www.oracle.com:443/downloads/index.html";
		
		URL url = null;
		try {
			url = new URL(urlStr);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		System.out.println("��������: " + url.getProtocol());
		System.out.println("ȣ��Ʈ: " + url.getHost());
		System.out.println("��Ʈ��ȣ: "+ url.getPort());
		System.out.println("���ϰ��: " + url.getFile());
		System.out.println("��ü: " + url.toExternalForm());
		System.out.println(url);
	}
}
