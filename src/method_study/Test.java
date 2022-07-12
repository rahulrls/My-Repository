package method_study;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		myMethod();
		//static method call from same class
		//to call static method from same calss --> directly call static method i.e methodname();

		Test1.myMethod2();
		//static method  call from another class 
		//to call static method from another calss --> directly call static method i.e classname.methodname();

	}
	
	public static void myMethod()
	{
	System.out.println("hi this my Method ");
	
	}
}
