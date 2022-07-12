package casting_study;

public class Up_Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Son s = new Son();
		father f =new father();
		s.bike();
		s.car();
		f.car();
		f.bike();
		s.education();
	System.out.println("***********");
	
	
		father d = new Son();
		d.bike();
		d.car();
		//d.education; //not eligible for casting because it is not common super class method
	}

}
