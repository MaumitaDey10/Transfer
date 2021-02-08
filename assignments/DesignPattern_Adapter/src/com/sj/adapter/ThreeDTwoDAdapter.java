package com.sj.adapter;

import com.sj.existing.ThreeDShape;
import com.sj.latest.TwoDShape;

public class ThreeDTwoDAdapter implements TwoDShape {
	
	ThreeDShape a3dShape;
	
	public ThreeDTwoDAdapter() {
		super();
		// TODO Auto-generated constructor stub
		
		
	}
	public ThreeDTwoDAdapter(ThreeDShape a3dShape) {
		super();
		this.a3dShape = a3dShape;
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		a3dShape.drawShape();
		
	}

	
}
