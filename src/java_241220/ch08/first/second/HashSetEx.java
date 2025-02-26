package java_241220.ch08.first.second;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		Set<String> computerLangs = new HashSet<>();
		
		
		
		
		for(String computerLang : computerLangs) {
			System.out.println(computerLang);
		}
		System.out.println("=======================");
		
		computerLangs.add("HTML");
		computerLangs.add("Bootstrap");
		computerLangs.add("CSS");
		computerLangs.add("Javascript");
		computerLangs.add("JAVA");
		computerLangs.add("JAVA");
		
		
		for(String computerLang : computerLangs) {
			System.out.println("computerLang: "+computerLang);
		}
		
	}
}
