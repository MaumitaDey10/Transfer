 package com.md;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map bookMap = new HashMap();
		
		bookMap.put("Java book", 450);
		bookMap.put("Data Structure",600);
		bookMap.put("C++",780);
		
		Set entries=bookMap.entrySet();
		
		Iterator itr = entries.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());

	}

}}
