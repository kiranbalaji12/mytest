package collection;

import java.util.*;

public class CollectionEx {
	public static void main(String[] args) {
		List <Integer> li = new ArrayList();
		li.add(500);
		li.add(501);
		li.add(502);
		li.add(503);
		li.add(502);
		System.out.println(li);
	
		Set <Integer> li2 = new TreeSet();
		li2.add(504);
		li2.addAll(li);
		
		for(Integer i : li2) {
			System.out.println(i);
		}

	}

}
