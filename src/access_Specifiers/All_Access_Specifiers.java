package access_Specifiers;

public class All_Access_Specifiers {

	public static void main(String[] args) {
		All_Access_Specifiers m= new All_Access_Specifiers();
		m.test1();
		m.test2();
		m.test3();
		m.test4();
		
		

	}

	private void test1() {
		System.out.println("hii...This is the Private Access Specifiers");//only within  in the class
	}
	
	void test2() {
		System.out.println("hii...This is the default Access Specifiers ");//remains only within the package
	}
	
	protected void test3() {
		System.out.println("hii...This is the Protected Access Specifiers");//remain only within the package and use inheritance in out side the package
	}
	
	public void test4() {
		System.out.println("hii..This is the Public Access Specifiers");//through the project
	}
	
	
	
	
}
