package constructorStudy;

public class UserDefine {
	String A,B,C,D;
	int E,F,G,H,K,I;
	float J,L;
	
	public  UserDefine (String universityname,String studentName,String Class,int marathi,int english,int maths,int science,int soScience,float totalMarks,float obtaineMarks) {
		
		A=universityname;
		B=studentName;
		C=Class;E=marathi;F=english;G=maths;H=science;I=soScience;
		J=totalMarks;;L=obtaineMarks;
				
	}
	

	public static void main(String[] args) {
		
			UserDefine Marks=new UserDefine("PUNE UNIVERSITY", "RAHUL", "SSC", 73, 85, 88, 96, 89, 500,  0);
	
			Marks.Avg();
	
	}

			public void Avg()
		{
				float L=(E+F+G+H+I);
	 
					float K=(L/J)*100;
	
	 
					System.out.println("University name - "+A);
	 System.out.println("Student Name - "+B);
	 System.out.println("Class - "+C);
	 System.out.println("Marathi - "+E);
	 System.out.println("English - "+F);
	 System.out.println("Maths - "+G);
	 System.out.println("Science - "+H);
	 System.out.println("Socail Science - "+I);
	 System.out.println("Obtain Marks "+L);
	 System.out.println("Total Marks - "+J);
	 System.out.println("Percentage - "+K);
	}
}
