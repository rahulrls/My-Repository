package thiskeywrd_study;

public class This_use_study {
	//"This" keyword is use for calling global variable from same/current class
	
			int a=400;
			int b=200;
			

	public static void main(String[] args) {
		
		This_use_study m =new This_use_study();
		m.add();

	}
		
		
		public void add() {
			int a=200;
			int sum = a+900;
		
		int b=100;
		
		int sub = 900-b;
		
		int sum1=this.a+500;
		int sub1=this.b*2;
		
		System.out.println("addition is "+sum);
		System.out.println("substraction is  "+ sub);
		System.out.println("addition is "+sum1);
		System.out.println("substraction is  "+ sub1);
		}
}
