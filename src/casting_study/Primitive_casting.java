package casting_study;

public class Primitive_casting {
	/// primitive casting is the  converting one data type info another  data type 
	// two type - 1. implicit 2. explicit 3. boolean
	// implicit- converting lower data type info type into higher data type info. it is also called widening casting where memory size goes increasing there is no data loss 
	// explicit- converging higher data type info into lower data type info. it is also called narrowing casting where memory size goes decreasing there is data loss
	
	public static void main(String[] args) {
			// implicit casting
		int a=100; // memory size of int is 4 byte lower data type info
		// a=100
		System.out.println(a);
		double b=a;	// memory size of double is 8 byte// converting higher data type // widening and no data loss
		// b=100.0
		System.out.println(b);

		
		// explicit casting
		
		double c=200.1214; //higher data type 
		System.out.println(c);
		
		int d= (int)c; //Converting lower data type
		System.out.println(d); ///narrowing and data loss 
		
	}

}
