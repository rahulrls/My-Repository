package arrays;

public class Arry_study {

	public static void main(String[] args) {
		//Kingdom Animal Tiger
		
		//array declaration
		String name []=new String[4];
		
		//array initialization
		name[0]="Kingdom";
		name[1]="Animal";
		name[2]="Tiger";
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		
		System.out.println("=====================");
		
		for (int i=0;i<=name.length-1;i++)
		{
			System.out.println(name[i]);
			
		}
		
		System.out.println("=====================");
		for (int i=name.length-1;i>=0;i--)
			
		{
		System.out.println(name[i]);	
		}
		
		
	}

}
