package access_specifier1;

import access_Specifiers.All_Access_Specifiers;

public class Access_2 extends All_Access_Specifiers {

	public static void main(String[] args) {
		All_Access_Specifiers b= new All_Access_Specifiers();//object created of another class
		b.test4();//calling  public method
		//if we want to call the protected class in other package then we have to call using Inheritance
		Access_2 v= new Access_2();
		v.test3();//calling protected method outside the pa
		v.test4();//calling public method
	}

}
