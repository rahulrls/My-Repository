package interface_Study;

public class Son implements Father,Mother {

	public static void main(String[] args) {
		Son m= new Son();
		m.study();
		m.love();
		m.maya();
		m.care();
		m.cooking();
		m.money();
		Father.job();//calling static method from father interface
		Mother.job();//calling static method from mother interface

	}

	@Override
	public void cooking() {
		System.out.println("Mothers cooking ");
		
	}

	@Override
	public void maya() {
		System.out.println("Mother Maya to son");
		
	}

	@Override
	public void care() {
		System.out.println("Father Care for Son");
		
	}

	@Override
	public void love() {
		System.out.println("Fathers Love for Son ");
		
	}
	
	public void study() {
		System.out.println("Sons Study");
	}

	@Override
	public void money() {
		// TODO Auto-generated method stub
		Father.super.money();
		Mother.super.money();
	}

}
