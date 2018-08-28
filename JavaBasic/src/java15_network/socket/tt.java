package java15_network.socket;

import java.nio.ByteBuffer;
import java.util.HashMap;

public class tt {
	public static void main(String[] args) {
		HashMap<String, Object> map = new HashMap<>();
		
		
		map.put("title", "hahaha.png".getBytes());
		
		System.out.println(map.get("title"));

	}
}
