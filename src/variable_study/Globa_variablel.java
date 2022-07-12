package variable_study;

public class Globa_variablel {
	int a=10;
	static int b=20;
	
	public static void main(String[] args) {
		
Globa_variablel t= new   Globa_variablel();
t.add();
System.out.println("this is globla variable "+t.a);
System.out.println("this is globla variable "+b);

int sum=800+t.a;
int sub=800-b;
System.out.println(sum);
System.out.println(sub);
	}
	
	public void add()
{
		int sum=50+b;
		int sub=50-a;
		System.out.println(sum);
	}
}
