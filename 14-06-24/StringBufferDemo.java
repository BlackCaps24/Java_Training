//Program to demonstrate StringBuffer Class

package com.tnsif.dayeighteen.string;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		 //Thread Safe
		 //String buffer is mutable
		
		StringBuffer obj = new StringBuffer("Hello");
		obj = obj.append(" World");
		
		//obj = obj.reverse();	
		
		StringBuffer obj1 = new StringBuffer("Hello");
		int val = obj.compareTo(obj1); // compares two objects
		System.out.println(val); // prints value in integer
		
		obj.length();
		System.out.println(obj.charAt(2));
		System.out.println(obj);
		
		
	}

}