package java_241220.ch08.third;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		Map<String, Integer> friends = new HashMap<>();
		
		friends.put("k건희", 100);
		friends.put("o건희", 90);
		friends.put("r건희", 80);
		friends.put("e건희", 70);
		friends.put("a건희", 60);
		
		for(String  strKey : friends.keySet()) {
			Integer strValue = friends.get(strKey);
			System.out.println(strKey+"strValue: " + strValue);
		}
	}
}
