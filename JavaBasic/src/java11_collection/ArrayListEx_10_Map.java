package java11_collection;

import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Map;
import java.util.Properties;

public class ArrayListEx_10_Map {
	public static void main(String[] args) {
		
		// HashMap �� ���� ����ȭó���Ǿ�����
		Map map = new Hashtable<>();
		
		// Properties
		Properties prop = new Properties();
		// .properties : �ַ� �ý����� �������� �����ϴ� ����
		
		try {
			prop.load(new FileReader("./src/java11_collection/list/user.properties"));
			
			System.out.println(prop);
			
			System.out.println("-------");
			//�Ӽ��� ��������
			String user = prop.getProperty("username");
			System.out.println("USER: "+ user);
			
			String pass = prop.getProperty("password");
			System.out.println("PASS: "+ pass);
			
			//�Ӽ��� �ٲٱ�
			prop.setProperty("password", "abcd");
			System.out.println(prop);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


