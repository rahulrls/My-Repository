package controlStatement;

public class If_Study {

	public static void main(String[] args) {
		//if marks is greater > than  50 then you are pass
		
		int marks=1;
		
		if(marks>50) 
		
		{
			
		System.out.println("You are pass ");
		}
		else {
			
			System.out.println("You are fail");
		}
		
		//is marks is less < than 50 then its clod
		
		int temp =13;
		
		if(temp<50) 
		{
			System.out.println("its  cold...");
		}
		else {
			System.out.println("its Hot...");
		}
		// if grade  is  Marks is >=50 then you are fail
		
		int Marks=60;
	if (Marks>=50)
		{
		System.out.println(" you are PASS");
		
		}
	else {
		System.out.println("you are FAIL");
	}
	//if marks is >=65 --> you are in distinction
	//if marks is >=60 and <65-->you are in fist class
	//if marks is >=50 and <60-->you are in second class
	//if marks is >=40 and <50-->you are just miss class
	// else you are fail
	
	int A=39;
	if (A>=65) {
		System.out.println("you are in Distinction");
		}
	
	else if (A>=60 & A<65 ) {
		System.out.println("you are in Fist class");
	}
	else if (A>=50 & A<60) {
		System.out.println("you are in Second class");
	}
	
	else if (A>=40 & A<50) {
		System.out.println("yor are Just Miss..");
		
	}
	else {
		System.out.println("You are Fail");
	}
	//Nested if else study
	/*if username is correct-->Enter password
	 {        if -->password is correct --> login success
	 			else-->enter correct password
	 			}
	 			else --> enter correct user name*/
	
	String UserName="Rahul4";
	String Password="Rahul@1236";
	
	if (UserName=="Rahul")
	{
		System.out.println("Enter Password");
		
		if (Password=="Rahul@123") 
			{
				System.out.println("Login Sucsess");
			}
		else		
	{
				System.out.println("Password Incorrect");
			}
	}
	else	 {
				System.out.println("Pls Enter Correct username");
	
			}
	
	
	
	
	}
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	


