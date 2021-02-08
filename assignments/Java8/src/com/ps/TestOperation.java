package com.ps;

public class TestOperation {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int x=1;
		//int y=6;
		
		
		
		
		invokeOperation(10,20,(int x1,int y1)->{return (x1+y1);});
		invokeOperation(10,20,(int x1,int y1)->{return (x1-y1);});
		invokeOperation(10,20,(int x1,int y1)->{return (x1*y1);});
		invokeOperation(10,20,(int x1,int y1)->{return (x1/y1);});
		
	}
	
	public static void invokeOperation(int a,int b,MathOperation op)
	{
		System.out.println(op.operate(a, b));
	}

	

}
