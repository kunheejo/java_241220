package java_241220.ch04.fourth;

public class People {

	public static void main(String[] args) {
		Member member  = new User();
		 member.showMyName();
		 member  = new Admin();
		 member.showMyName();
	}
}
