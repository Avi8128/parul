package com.parul.looptest;

public class Whileloop {

	public static void main(String[] args) {
//		int s=1;
//		while(s<=6) {
//		   System.out.println(s);
//		   s++;
//		}//Nested for Loop
	  for(int parentvar=0;parentvar<=5;parentvar++)
		for(int childvar=1;childvar<=2;childvar++)
			System.out.println("parentvar::"+parentvar + "childvar::"+childvar);
	
	// infinite for loop
	for(;;) {
		
		System.out.println("avi");
	}
  }
}