package java_241220.ch04.third;

public class television implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");		
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");
		
	}

	@Override
	public void setVolume(int volum) {
		// TODO Auto-generated method stub
		
	}

}
