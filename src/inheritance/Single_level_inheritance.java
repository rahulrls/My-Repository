package inheritance;

public class Single_level_inheritance {

	public static void main(String[] args) {
			Mother M= new Mother();
			Child C= new Child();
			M.nature();
			C.bike();
			
			Mother.care();
			C.nature();
			Child.care();
			Child.moblie();
			C.bike();
	}

}
