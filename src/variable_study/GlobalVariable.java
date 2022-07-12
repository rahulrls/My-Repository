package variable_study;

public class GlobalVariable {
	int a=20;
	static int b=40;
	float c=4.5f;
static float d=2.3f;
	public static void main(String[] args) {
		
		GlobalVariable gv= new  GlobalVariable();
	gv.test();
		System.out.println("non static global variable is "+gv.a);// calling non static global variable
		System.out.println("non static global variable is "+gv.c);//calling static global variable
		System.out.println("static global variable is "+b);//calling static global variable
		System.out.println("static global variable is "+d);//calling non static global variable
	
		float sub=400-gv.a-d;
		int sum=gv.a+b;
		float sub1=gv.a-gv.c;
		System.out.println("Sub is "+sub);
		System.out.println("Sum is "+sum);
		System.out.println("Sub1 is "+sub1);
		
		Test s=new Test();
		System.out.println("globale non staic variable from other class "+s.p);
	
		System.out.println("globale static variable from other class "+Test.q);
		float A=s.p+Test.q+gv.a+b+gv.c+d; //addition of same class and another class global variable
		System.out.println("Addition is "+A);
	}
 public void test() {
	 int e=210;
	 float sum =a+20-c+e;
	 float sub=a-d+c+a+b*e;
	 System.out.println("hi "+ sum);
	 System.out.println("hi "+sub);
	 System.out.println("hi " +e);
 }
}
