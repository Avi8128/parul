package com.parul14th;

public class LinearSearchDemo {

	public static void main(String[] args) {
		//int[] arr= {1,15,16,17,2};
		//int target =100;
		char [] ch = {'s','h','r','e','y','a'};
		char target='e';
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
	
