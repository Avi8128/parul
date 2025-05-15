package com.parul13th;

public class Reverstring {

	public static void main(String[] args) {
		String o = "I MA GOD";
		String [] splitrev = o.split("");
		System.out.println(splitrev.length);
		for (int i = splitrev.length-1; i>=0; --i) {
			System.out.print(splitrev[i]);
		}
		System.out.println();
		String r = "";
		for(int i = o.length()-1; i>=0; i--) {
			r+=o.charAt(i);
		}
		System.out.println(r);
		// TODO Auto-generated method stub

	}

}
