package java_241220.ch07.first;

import java.awt.Toolkit;

public class TryCatchFinalEx {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i=0; i<5; i++) {
			try {
				toolkit.beep();
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		 
		
		
		
	}
	public void abc() throws InterruptedException {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i=0; i<5; i++) {
			toolkit.beep();
			Thread.sleep(500);
		}
	}
	
	
	public void xyz() throws InterruptedException {
		abc();
	}
}
