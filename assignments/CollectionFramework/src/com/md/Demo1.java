package com.md;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Demo1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList intList = new ArrayList();
		
		intList.add("Chennai");
		intList.add("Hyderabad");
		intList.add("Delhi");
		intList.add("Pune");
		
		intList.add(1,"Calcutta");
		
		Iterator itr =  intList.iterator();
		
		
		while(itr.hasNext()) {
			
			Object s = itr.next();
			System.out.println(((String) s).length());
		}
		
		for(Object s:intList) {
			
			System.out.println(s);
			System.out.println(((String) s).length());
		}

	}

}
