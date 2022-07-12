package inheritance;

public class Multilevel_Inheritance {

	public static void main(String[] args) {
		Grand_Mother g= new Grand_Mother();
		Mother m= new Mother();
		Child c = new Child();
		
		
		g.stories();
		m.stories();
		c.stories();
		
		Mother.care();
		Child.care();
	c.stories();c.bike();c.nature();
	}

}
