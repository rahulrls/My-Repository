package collection_Study;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Link_list {

	public static void main(String[] args) {
	
		
		LinkedList link=new LinkedList<>();
		
		link.add("Mumbai");

		link.add("Mumbai");
		link.add(null);
		link.add(null);
		link.add(121.121);
		link.add(true);
		link.add('A');
		link.add(555);
		link.add("");
		link.add("Pune");
		
		
		System.out.println(link);
		System.out.println(link.size());
		System.out.println(link.clone());
		System.out.println(link.getFirst());
		System.out.println(link.getLast());
		System.out.println(link.element());
		System.out.println(link.contains(link.get(1)));
		System.out.println(link.peek());
		System.out.println(link);
		System.out.println(link.peekFirst());
		System.out.println(link.peekLast());
		System.out.println(link.poll());
		System.out.println(link);
		System.out.println(link.pop());
		System.out.println(link);
		
		
		System.out.println("=================================================");
		
		
		//forloop
		
		for(int i=0;i<=link.size()-1;i++)
		{	
			System.out.println(link.get(i));
		}
		
		
		System.out.println("=================================================");
		//list iterator
		
		ListIterator lis = link.listIterator();
		
		while(lis.hasNext())
		{
			System.out.println(lis.next());
		}
		
		System.out.println("=================================================");

		//iterator
		
		Iterator ite = link.iterator();
		
		while(ite.hasNext())
		{
			System.out.println(ite.next());
		}
		
		System.out.println("=================================================");

		//for each
		
		for(Object io:link)
		{
			System.out.println(io);
		}
		
		System.out.println("#####################################################");
		
		LinkedList<Integer> inte= new LinkedList<>();
		
		inte.add(121);
		inte.add(200);
		inte.add(45);
		
		System.out.println(inte);
		
		System.out.println("#####################################################");

		
		LinkedList<Character> cha=new LinkedList<>();
		cha.add('A');
		cha.add('v');
		cha.add('B');
		cha.add('o');
		
		
		System.out.println(cha);
		
		System.out.println("#####################################################");

		
		LinkedList<String> str=new LinkedList<>();
		str.add("fdhs");
		
		str.add("rahul");
		str.add("454545");
		str.add("hiii,,ss");
		
		System.out.println(str);
		
		System.out.println("#####################################################");

		LinkedList<Float> flo= new LinkedList<>();
		
		flo.add(121.22f);
		flo.add(521.22f);
		flo.add(0.22f);
		flo.add(451.772f);
		
		System.out.println(flo);
		System.out.println("#####################################################");

		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
