 package com.sj;

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
		
		Set<Entry<String,Integer>> entries=bookMap.entrySet();
		
		Iterator<Entry<String,Integer>> itr = entries.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());

	}

}}
