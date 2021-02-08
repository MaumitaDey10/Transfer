package com.md;

import java.util.TreeSet;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 =new Employee(1,"debu",7809876);
		Employee e2 =new Employee(2,"momo",5678909);
		Employee e3 =new Employee(3,"ghumra",9089090);
		
		TreeSet empSet = new TreeSet();
		
		empSet.add(e1);
		empSet.add(e2);
		empSet.add(e3);
		
		System.out.println(empSet);

	}

}
