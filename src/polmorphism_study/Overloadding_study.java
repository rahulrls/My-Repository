package polmorphism_study;

public class Overloadding_study {

	int a=200;
	int b=300;
	int c=600;
	
	
	
	public void sum() {
		int add=a+b;
		System.out.println("sum is "+add);
	}
	
	public void sum(int a,int b) {
		int add=a+b;
		System.out.println("addition is "+add);
		
	}
	public  void sum(int a,int b,int c) {
	
		int add=a+b+c;
		System.out.println("adithoin is - "+add);
	}

}
