package java_241220.ch05.first;

import java.awt.Toolkit;

public class Tr {

	
	public static void main(String[] args) {
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
//		
//		thread.start();
//		
//		for(int i=0; i<5; i++) {
//			 System.out.println("12");
//			try {Thread.sleep(500);} catch (Exception e) {}
//		}
		
		
		
		Thread thread  = new Thread(new Runnable() {
				 
				public void run() {
					Toolkit toolkit = Toolkit.getDefaultToolkit();
					for(int i=0; i<5; i++) {
						toolkit.beep();
						try {Thread.sleep(500);} catch(Exception e) {}
					}
				}
		});
		
		thread.start();
		for(int i=0; i<5; i++) {
			 System.out.println("12");
			try {Thread.sleep(500);} catch (Exception e) {}
		}
		
		
		
		
		
		
	}
}
