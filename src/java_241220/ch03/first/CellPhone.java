package java_241220.ch03.first;

public class CellPhone {

	//필드
	String model;
	String color;
	
	//생성자
	 CellPhone(){
		 
	 }
	
	 CellPhone(String m, String c) {
		this.model = m;
		this.color = c;
	}
	
	//메소드
	 void powerOn() {
		 System.out.println("전원을켭니다");
	 }
	 void powerOff() {
		 System.out.println("전원을끕니다");
	 }
}
