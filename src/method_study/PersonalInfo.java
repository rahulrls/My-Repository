package method_study;

public class PersonalInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PersonalInfo MyData= new  PersonalInfo();
		MyData.myInfo("Rahul", "Titwala", "abc@gmail.com", "999558822", 25, "AB", 'M');
		
		
	}

	public void myInfo(String Name,String Address,String Email,String mobNo,int age,String bloodGroup,char gnder)
	{
		System.out.println("#################################");
		System.out.println("Name - "+Name);
		System.out.println("Address - "+Address);
		System.out.println("Email - "+Email);
		System.out.println("Mobile No - "+mobNo);
		System.out.println("Age - "+age);
		System.out.println("Blood Group - "+bloodGroup);
		System.out.println("Gender - "+gnder);
		System.out.println("#################################");
	
	}
	
	
	
	
	
	
	
}
