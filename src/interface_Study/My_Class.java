package interface_Study;

public class My_Class implements My_interface {

	public static void main(String[] args) {
		
		My_Class m = new My_Class();
		m.Name();
		m.Class();
		m.info();
		System.out.println("the value of a is "+a);
		m.My_Method();
		

	}

	public void My_Method() {
		int b=200;
	 int sum = My_interface.a+b; 
				
		System.out.println("Sum is "+sum);
	}
	@Override
	public void Name() {
		System.out.println("hii..My name is Rahul ");
		
	}

	@Override
	public void Class() {
		System.out.println("hii..My Class is 12th science  ");
		
	}

	@Override
	public void info() {
		System.out.println("hii..My contact no is 2121542 ");
		
	}

}
