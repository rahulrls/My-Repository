package method_study;

public class PracticeForAllData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
allData(102, 120, 20, 40, 5.5f, 1.5f, 2.25f, 3.0f);//call method from same class

PracticeForAllData M=new PracticeForAllData ();//create object

M.All(5, 4, 2, 3, 4.2f, 2.2f, 1.2f, 2.3f);//call method from same class

Test1.myMethod2();//call static method from diff class

RailwayTicketInfo r= new RailwayTicketInfo();//create object for non static method from diff class

r.TicketInfo("ram", 1, "pune","mumbai", "Fog", 12, 14, 21, "up", 0, "2.2.22");

//call non static from diff class
PatientInfo G = new PatientInfo ();
G.patient("Raj","dkt", 12, 20, 20, 20);

	}
public static void allData(int A,int B,int C,int D ,float a,float b,float c,float d)
//parameterize static method
{
	int sum= (A+B+C+D),sub=A-B-C-D,div=A/B/C/D,avg=(sum)/2;
	float Add=sum+sub,Sub=C-c,Avg=(Add)/4;
	
	System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
	System.out.println("sum is "+sum);
	System.out.println("sub is "+sub);
	System.out.println("div is "+div);
	System.out.println("avg is "+avg);
	System.out.println("flaot add is "+Add);
	System.out.println("flaot sub is "+Sub);
	System.out.println("float avg is "+Avg);
	System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
	
	}
	public void All(int a,int b,int c,int d,float A,float B,float C,float D) {
	//Parameterize non static method
	float add=(a+A)-(B+C);
	
	System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
	System.out.println("FLOAT ADD IS "+add);
	System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
	
	
		
	}
}
