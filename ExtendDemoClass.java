package com.javaProgram;

public class ExtendDemoClass extends Demo{

	@Override
	void display() {
		//super.show();
		System.out.println("Child Class for Test");
		
	}
	public static void main(String[] args) {
	Demo result=new ExtendDemoClass();
	result.display();
	
	//result.show();
}
}
