// List.demo

package com.tnsif.dayfifteen.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {

	public static void main(String[] args) {

//Traverse a list
	
		Iterator<String> i = names.iterator();
		while(i.hasNext()) {
			String nm = i.next();
			System.out.println(nm);
			
			if(nm.equals("Ashi"))
				i.remove();
			
		}
		
		
		System.out.println("Name List is: "+names);
		
		//Traverse in reverse / Backward order
		
		ListIterator<String> li = names.listIterator(names.size());
		
		while(li.hasPrevious())
		{
			String nm=li.previous();
			System.out.println(nm);
		}
	}

}