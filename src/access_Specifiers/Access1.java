package access_Specifiers;

public class Access1 {

	public static void main(String[] args) {
		All_Access_Specifiers n =new All_Access_Specifiers();
		//n.test1(); we can't call private Access Specifiers because the scope of this is only within the class
		n.test2();//calling default method from another class
		n.test3();//calling protected method from another class
		n.test4();//calling public method from another class
	}

}
