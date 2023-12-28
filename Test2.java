package com.test.in;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str="Java";
       StringBuilder sb=new StringBuilder(str);
       sb.append(" is").append(" Language");
       str.concat(" is").concat(" Language");
       System.out.println(sb);
       System.out.println(str);
	}

}
