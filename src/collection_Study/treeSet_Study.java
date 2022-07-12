package collection_Study;

import java.util.Iterator;
import java.util.TreeSet;

public class treeSet_Study {

	public static void main(String[] args) {
		 
		
		TreeSet t =new TreeSet();
		
		t.add(1454);
		//t.add(11.11f);
		//t.add("ddd");
		//t.add('A');
		t.add(45450);
		t.add(1);
		t.add(6);
		t.add(9);
		t.add(658);
		//insertion of order is Ascending
		System.out.println(t);
		
		System.out.println(t.ceiling(6));
		System.out.println(t);
		System.out.println(t.size());
		System.out.println(t.first());
		System.out.println(t.floor(658));
		
		System.out.println("***************************************************");
//		
//		for(int i=0;i<=t.size()-1;i++) {
//			
//			System.out.println(t.get(i));
//		}
		
		Iterator tr=t.iterator();
		
		while(tr.hasNext()) {
			System.out.println(tr.next());
		}
		
		System.out.println("************************************************");
		
		for(Object tre:t) {
			
			System.out.println(tre);
		}
		
		
		
		
		
		
	}

}
