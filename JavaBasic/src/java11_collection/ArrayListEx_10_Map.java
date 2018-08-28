package java11_collection;

import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Map;
import java.util.Properties;

public class ArrayListEx_10_Map {
	public static void main(String[] args) {
		
		// HashMap 과 같고 동기화처리되어있음
		Map map = new Hashtable<>();
		
		// Properties
		Properties prop = new Properties();
		// .properties : 주로 시스템의 설정들을 저장하는 파일
		
		try {
			prop.load(new FileReader("./src/java11_collection/list/user.properties"));
			
			System.out.println(prop);
			
			System.out.println("-------");
			//속성값 가져오기
			String user = prop.getProperty("username");
			System.out.println("USER: "+ user);
			
			String pass = prop.getProperty("password");
			System.out.println("PASS: "+ pass);
			
			//속성값 바꾸기
			prop.setProperty("password", "abcd");
			System.out.println(prop);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


