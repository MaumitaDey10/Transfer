package com.md;

import java.util.Iterator;
import java.util.TreeSet;

public class Demo2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet intSet = new TreeSet();
		
		

		intSet.add(5);
		intSet.add(6);
		intSet.add(7);
		intSet.add(5);
		
		Iterator itr = intSet.iterator();
		
		System.out.println(intSet);
		
		while(itr.hasNext()) {
			
			Integer s =(Integer)itr.next();
			
			System.out.println(s.intValue());
		}
		

	}

}
