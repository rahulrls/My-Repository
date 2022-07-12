package collection_Study;

import java.util.ArrayList;

public class Arraylist_study {

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
	
	for(int i=0;i<=rs.size()-1;i++)
	{
		System.out.println(rs.get(i));
	}
	
	
	
	
	
	}

}
