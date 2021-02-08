package com.j;//Functional Interface Project//

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Demo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer> p = (num1)->(num1>50)?true:false;
		
		System.out.println(p.test(51));
		
		
		Supplier <String> s=()-> "Str";
		
		
		System.out.println(s.get());
		
		
		Consumer <String> c = (Str)->System.out.println(Str);
		
		c.accept(s.get());
	}

}
