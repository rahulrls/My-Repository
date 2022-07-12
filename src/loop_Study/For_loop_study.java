package loop_Study;

public class For_loop_study {

	public static void main(String[] args) 
	{
		//print Apple 10 times
		String fruit="Apple";
		for(int a=1;a<=10;a++) {
			System.out.println(fruit);
		}

		//print 30 to 21
		for (int b=30;b>=21;b--)
		{
			System.out.println(b);
			
		}
		for (int c=1;c<=10;c++) {System.out.println(c);}
		
		//print 2 table
		for (int s=2;s<=20;s=s+2) {System.out.println(s);}
		//print 4 table
		for (int d=4;d<=40;d=d+4) {System.out.println(d);}
		//print 5 table in reverse order
		for (int e=130;e>=13;e=e-13) {System.out.println(e);}
	}

}
