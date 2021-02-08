package com.sj.client;

import com.sj.adapter.ThreeDTwoDAdapter;
import com.sj.existing.Cone;
import com.sj.latest.Circle;
import com.sj.latest.Drawing;
import com.sj.latest.Rectangle;

public class DrawingClient {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Drawing d1 = new Drawing();
		d1.addShape(new Circle());
		d1.addShape(new Rectangle());
		//d1.drawShapes();
		
		d1.addShape(new ThreeDTwoDAdapter(new Cone()));
		d1.drawShapes();
		

	}

}
