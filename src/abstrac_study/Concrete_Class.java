package abstrac_study;

public class Concrete_Class extends Abstract_class{

	public static void main(String[] args) {
		Concrete_Class m=new Concrete_Class();
			m.test2();
			m.test();
			m.testing();

	}

	@Override
	public void test() {
		System.out.println("hii... this me too here");
		
	}
public void testing() {
	System.out.println("hi..this my testing");
}
}
