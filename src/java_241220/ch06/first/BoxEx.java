package java_241220.ch06.first;

public class BoxEx {

	public static void main(String[] args) {
//		Box box = new Box();
//		box.a = 1;
//		System.out.println(box.a);
		
		Box<Integer> box = new Box<>();
//		Box<Integer> box = new Box<>(Integer);
		box.setT(1);
		System.out.println(box.getT());
		
		
		Box<String> box1 = new Box<>();
		
		box1.setT("건희");
		System.out.println(box1.getT());
	}
}
