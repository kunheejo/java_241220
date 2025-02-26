package java_241220.ch06.third;

public class Tr<T,M> {

	private T t;
	private M m;
	
	public T getT() {
		return t;
	}
	
	public void setT(T t) {
		this.t = t;
	}
	public M getM() {
		return m;
	}
	
	public void setM(M m) {
		this.m = m;
	}
	
	public static void main(String[] args) {
		
		Tr<Integer,String> tr = new Tr<>();
		 
		
		tr.setT(1);
		tr.setM("조건희");
		 System.out.println(tr.getT());
		 System.out.println(tr.getM());
		  
	}
}
