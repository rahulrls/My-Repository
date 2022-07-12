package interface_Study;

	// Multiple inheritance Using interface

public interface Father {
	
	void care();
	void love();
	default void money(){
		System.out.println("father having Rs.25000/-");
	}
	static void job() {
		System.out.println("Father is Govt. officer");
	}
}
