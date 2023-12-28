package com.javaProgram;

public class ExceptionCheck {

	public static void main(String[] args)  {
		
		try {
			int a=5/0;
			throw new Exception("This is right");
		}catch(NullPointerException e) {
		System.out.println("Error-1"+e);	
		}catch(Exception a) {
			System.out.println("Error-2"+a);	
		}

	}

}
