package com.parul13th;

public class CountVowels {

	public static void main(String[] args) {
		String s = "IM a devil of my world";
		String [] splitrev = s.split("");
//		String[] vowels = {"a","e","i","o","u","A","E","I","O","U"};
		String vowels = "aeiouAEIOU";
		String [] v = vowels.split("");
		int count =0;
		
		for (int i = 0; i<v.length; i++) {
			for(int j=0; j<splitrev.length; j++) {
				if(splitrev[j].equals(v[i])) {
					count++;
				}
			}
		}
		System.out.println(count);
		// TODO Auto-generated method stub

	}

}
