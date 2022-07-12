package collection_Study;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector_study {

	public static void main(String[] args) {


		//GENERIC VECTOR
		Vector v =new Vector();
		
		v.add("Mumbai");
		v.add("pune");
		v.add("navi Mumbai");
		v.add("nashik");
		v.add(125);
		v.add(100);
		v.add(null);
		v.add('A');
		v.add(true);
		v.add("");
		v.add(1.1121);
		
		System.out.println(v);
		System.out.println(v.capacity());
	
		System.out.println(v.size());
		System.out.println(v.isEmpty());
		System.out.println(v.isEmpty());
		System.out.println(v.get(9));
		System.out.println(v.firstElement());
		System.out.println(v.elementAt(5));
		System.out.println(v.equals(null));
		System.out.println(v.lastElement());
		
		
		
		System.out.println("=============================================");
		//list iterator
		
		ListIterator vlist = v.listIterator();
		
		while (vlist.hasNext())
		{
			System.out.println(vlist.next());
		}
			
			
		System.out.println("=============================================");

	//iterator		
			
			Iterator vitra = v.iterator();
			
			while(vitra.hasNext())
			{
				System.out.println(vitra.next());
			}
			
			
			System.out.println("=============================================");

			//for loop
			
			for (int i=0;i<=v.size()-1;i++)
			{
				System.out.println(v.get(i));
			}
			
			
			System.out.println("=============================================");
//for each loop
			for(Object gi:v) {
				
				System.out.println(gi);
			}
			
			
			
			//Enumeration
			
			Enumeration Enu = v.elements();
			
			
			
			
			
			while(Enu.hasMoreElements())
			{
				System.out.println(Enu.nextElement());
			}
			
			Vector<Integer> in=new Vector<>();
			
			in.add(879);
			in.add(5652);
			in.add(0212);
			in.add(212);
			in.add(12);
			in.add(54655);
			
			System.out.println("=============================================");

			System.out.println(in);
			System.out.println(in.capacity());
			System.out.println(in.equals(in));
			System.out.println(in.hashCode());
			System.out.println(in.toString());
			System.out.println(in.indexOf(0));
			
			
	}

}
