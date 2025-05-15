package com.parul12th;

public class StringObjectCreation {

	public static void main(String[] args) {
		String str=new String("abc");
		
		String stringLiteralobj="xyz";
		System.out.println(stringLiteralobj);
		String str1 = null;
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		String str2= "    xyz    ";
		System.out.println(str2.trim());
		
		String Str2="split Demo";
		String [] splitArr=Str2.split(" ");
		System.out.println(splitArr[0]);
		
		char charAt0Index=Str2.charAt(0);
		System.out.println(charAt0Index);
		System.out.println(Str2.toCharArray()[2]);
		// TODO Auto-generated method stub

	}

}
