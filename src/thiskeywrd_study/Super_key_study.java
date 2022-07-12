package thiskeywrd_study;

public class Super_key_study extends This_use_study{
	
 int a=300; int b=600;
 
	public static void main(String[] args) {
		
	Super_key_study n=new Super_key_study();
	n.addi();


	}
	public void addi() {
		int sum=a+20;
		int sub = b-20;
		
		int sum2=this.a+30;
		int sub2=this.b-30;
		
		int sum3=this.a+super.a;
		int sub3=this.b-super.b;
		
		
		System.out.println("sum "+sum);
		System.out.println("sbu "+sub);
		System.out.println("sum "+sum2);
		System.out.println("sbu "+sub2);
		System.out.println("sum "+sum3);
		System.out.println("sbu "+sub3);
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(super.a);
		System.out.println(super.b);
	}
	
}
