package com.singleton;

public class Singleton {
	
	public static void main(String[] args) {
		
		
		//Demo demo=new Demo();   //does not create new object (private constructor)
	   // Demo demo1=new Demo();
		
		Demo demo=Demo.getAllDetails();
		Demo demo1=Demo.getAllDetails();
		Demo demo2=Demo.getAllDetails();
		
		System.out.println(demo.hashCode());
		System.out.println(demo1.hashCode());
		System.out.println(demo2.hashCode());
		
	}

}
