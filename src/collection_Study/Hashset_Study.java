package collection_Study;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class Hashset_Study {

	public static void main(String[] args) {
		
		
		HashSet hset= new HashSet();
		
		hset.add("Rahul");
		hset.add("Rahul");
		hset.add(1);
		hset.add(null);
		hset.add(null);
		hset.add(true);
		hset.add(1.11f);
		hset.add('A');
		hset .add("");
		hset .add(1);
		
		System.out.println(hset);
		System.out.println(hset .size());
		System.out.println(hset .containsAll(hset));
		System.out.println(hset .equals(null));
		System.out.println(hset .isEmpty());
		System.out.println(hset .remove(null));
		System.out.println(hset);
		System.out.println(hset .add(null));
		System.out.println(hset );
		
		//for loop
		
//		for (int i=0;i<=hset.size()-1;i++)
//		{
//			System.out.println(( hset).get(i));
//		}
		System.out.println("******************************************************");
		//iterator
		
		Iterator hi= hset.iterator();
		
		while(hi.hasNext()) {
			
			System.out.println(hi.next());
		}
		
		System.out.println("******************************************************");
	
		
		// list iterator
		
		//ListIterator li= hset.listIterator();
		for(Object ech:hset) {
			
			System.out.println(ech);
			
		}
		System.out.println("************************************************");
		
		HashSet<Integer> in=new HashSet<>();
		
		
		in.add(1245);
		in.add(2532);
		in.add(12);
		in.add(658);
		in.add(99);
		in.add(557);
		in.add(607);
		
		System.out.println(in);
		
		System.out.println("************************************************");

		
		for(Integer a:in) {
			System.out.println(a);
		}
		
		System.out.println("************************************************");

		HashSet<String> str= new HashSet<>();
		
		str.add("tube");
		str.add("call");
		str.add("phone");
		str.add("good");
		str.add("bad");
		
		System.out.println(str);
		
		System.out.println("************************************************");

		
		Iterator i=str.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("************************************************");

		
		HashSet<Boolean> boo= new HashSet<>();
		
		boo.add(true);
		boo.add(null);
		boo.add(false);
		
		System.out.println(boo);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
