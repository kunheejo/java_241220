package java_241220.ch05.first;

import java.awt.Toolkit;

public class BeepEx {

	public static void main(String[] args) {
		 
		
		
//		for(int i=0; i<5; i++) {
//			toolkit.beep();
//			try {Thread.sleep(500);} catch (Exception e) {}
//		}
//		for(int i=0; i<5; i++) {
//			 System.out.println("12");
//			try {Thread.sleep(500);} catch (Exception e) {}
//		}
		 
		
		
		
		
		
		
		
		//방법1
		Runnable runnable = new BeepPrintRunnable();
		Thread thread = new Thread(runnable);
		
		//방법2
//		Thread thread = new Thread(new Runnable() {
//			public void run() {
//				Toolkit toolkit = Toolkit.getDefaultToolkit();
//				for(int i=0; i<5; i++) {
//					toolkit.beep();
//					try {Thread.sleep(500);} catch (Exception e) {}
//				}
//			}
//		});
		
		thread.start();
		
		for(int i=0; i<5; i++) {
			 System.out.println("12");
			try {Thread.sleep(500);} catch (Exception e) {}
		}
	}
}
