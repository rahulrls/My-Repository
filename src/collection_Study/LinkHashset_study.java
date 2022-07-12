package collection_Study;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkHashset_study {

	public static void main(String[] args) {


		LinkedHashSet link= new LinkedHashSet();
		

				link.add("Rahul");
				link.add("Rahul");
				link.add(1);
				link.add(null);
				link.add(null);
				link.add(true);
				link.add(1.11f);
				link.add('A');
				link .add("");
				link .add(1);
				
		System.out.println(link );
		System.out.println(link .size());
		System.out.println(link.equals("Rahul"));
		System.out.println(link .isEmpty());
		System.out.println(link .remove('A'));
		System.out.println(link);
		System.out.println(link.add('B'));
		System.out.println(link);
		
		System.out.println("***************************************");
		//iterator
		
		Iterator it=link.iterator();
		
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
		System.out.println("***************************************");	
					
		//for loop
		
//		for (int i =1;i<=link.size()-1;i++) {
//		
//		System.out.println(link.get(i));
//		
//		}
		
		///for each
		
		for (Object li:link) {
		System.out.println(li);
		
		}
		
		System.out.println("***************************************");
		
		LinkedHashSet<Integer> inte=new LinkedHashSet();
		
		inte.add(565);
		inte.add(698);
		inte.add(4547);
		inte.add(0121);
		
		
		System.out.println(inte);
		
		System.out.println("***************************************");
		
		
				
		LinkedHashSet<String> str=new LinkedHashSet<>();
		
		str.add("hiii");
		str.add("good");
		str.add("boy");
		System.out.println(str);
		

	}

}
