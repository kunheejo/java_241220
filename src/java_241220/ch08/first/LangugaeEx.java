package java_241220.ch08.first;

import java.util.ArrayList;
import java.util.List;

public class LangugaeEx {

	public static void main(String[] args) {
		
//		ArrayList<String> friends = new ArrayList<>();  밑에 코드가 나중에 객체가 바뀌어도 재사용가능
		List<String> friends = new ArrayList<>();
		
		
		System.out.println("test.size(): " +friends.size());
		friends.add("k건희");
		friends.add("o건희");
		friends.add("r건희");
		friends.add("e건희");
		friends.add("a건희");
		friends.add("n건희");
		 
		System.out.println("test.size(): " +friends.size());
		
		friends.remove(0);
		System.out.println("test.size(): " +friends.size());
		friends.remove(3);
		System.out.println(friends);
		System.out.println("test.size(): " +friends.size());
		 
		
		for(int i=0; i<friends.size(); i++) {
			System.out.println("test.get(): "+friends.get(i));
		}
		
		System.out.println("=========향상된for문===========");
		
		
		
		String[] ss = new String[3];
		
		for(String friend: friends) {
			System.out.println("a: " + friend);
		}
		
		for(String friend: ss) {
			System.out.println("b: " + friend);
		}
	}
}
