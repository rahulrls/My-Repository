package interface_Study;

public interface Mother {
	
	void cooking();
	void maya();
	default void money() {
		System.out.println("Mother having Rs.10000/-");
	}

	static void job() {
		System.out.println("Mother is House Wife");
	}
}
