package com.parul15th;

public class LinerSearchCharacter {

	public static void main(String[] args) {
		char [] ch = {'s','h','r','e','y','a'};
		char target='r';
		boolean isFound=false;
		for(int i=0;i<ch.length;i++) {
		if(ch[i]==target) {
			System.out.println("searching object index::"+i);
			isFound = true;
			
		
		}
		
		// TODO Auto-generated method stub

	}
		if(!isFound)
			System.out.println("target is not avaiable");
	
	}
}
	
