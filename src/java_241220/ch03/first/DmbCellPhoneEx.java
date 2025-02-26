package java_241220.ch03.first;

public class DmbCellPhoneEx   {

	public static void main(String[] args) {
		
		 
		
		CellPhone cellPhone1 = new CellPhone("iPhone","16");
		 
		System.out.println(cellPhone1.model+" "+cellPhone1.color);
		  
		 
		
		DmbCellPhone demCellPhone = new DmbCellPhone();
		demCellPhone.model = "SAMSUNG2";
		demCellPhone.color = "Black2";
		System.out.println(demCellPhone.model);
		demCellPhone.powerOn();
		demCellPhone.powerOff();
	}
}
