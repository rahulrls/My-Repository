package collection_Study;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylist_Cursor_Study {

	public static void main(String[] args) {
		
		
		ArrayList rs = new ArrayList();
		rs.add("Velocity");
		rs.add('A');
		rs.add("Velocity");
		rs.add(null);
		rs.add(124);
		rs.add(124.66);
		rs.add(null);
		rs.add(true);
		
		
		System.out.println(rs);
		System.out.println(rs.size());
		System.out.println(rs.isEmpty());
		System.out.println(rs.contains("Velocity"));
		System.out.println(rs.get(3));
		System.out.println(rs.indexOf('A'));
		System.out.println(rs.indexOf(null));
		System.out.println(rs.remove(2));
		System.out.println(rs);
		rs.add(2, "Rahul");
		System.out.println(rs);
		System.out.println(rs.clone());
		System.out.println();
		
		System.out.println("=============================================================================");
		
		Iterator it = rs.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("=============================================================================");

		
		
		ListIterator lit = rs.listIterator();
		while(lit.hasNext())
		{
			System.out.println(lit.next());
		}
		
		System.out.println("=============================================================================");

		//for each loop
		
		for(Object j:rs) {
			System.out.println(j);
		}
		
		
		System.out.println("=============================================================================");

		
		
		ArrayList<Integer>at=new ArrayList<>();
		
		at.add(1);
		at.add(5);
		at.add(6);
		at.add(2);
		at.add(11);
		at.add(15);
		
		
		
		for(Integer u:at) {
			
			System.out.println(u);
		}
		
		System.out.println("=============================================================================");

		
		ArrayList<Character> rls=new ArrayList<>();
		
		rls.add('A');
		rls.add('C');
		rls.add('V');
		rls.add('F');
		rls.add('R');
		rls.add('A');
		
		Iterator<Character> Y = rls.iterator();
		
		while(Y.hasNext())
		{
			System.out.println(Y.next());
		}
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
