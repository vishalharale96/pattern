package com.singleton;

public class Demo {

	// 1st step create the static instance of class
	static Demo demo = new Demo();

	// 2nd step create the private constructor
	private Demo() {

	}

	// 3rd step create the static method
	public static Demo getAllDetails() {

		return demo;
	}
}
