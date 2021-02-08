package com.sj.latest;

import java.util.ArrayList;
import java.util.Collection;

public class Drawing {

	Collection<TwoDShape> shapes;
	
	public Drawing() {
		super();
		
		shapes = new ArrayList<TwoDShape>();
		// TODO Auto-generated constructor stub
	}

	public void addShape(TwoDShape shape) {
		shapes.add(shape);
	}

	public void drawShapes() {
		for(TwoDShape s:shapes)
			s.draw();
	}
}
