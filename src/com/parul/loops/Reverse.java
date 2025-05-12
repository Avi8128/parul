package com.parul.loops;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
//		 Scanner sc = new Scanner(System.in);
//	        
//	        System.out.print("Enter a number: ");
//	        int number = sc.nextInt();
//	        int reversed = 0;
//	        
//	        while (number != 0) {
//	            int digit = number % 10;       // Get last digit
//	            reversed = reversed * 10 + digit; // Append digit
//	            number /= 10;                  // Remove last digit
//	        }
//	        
//	        System.out.println("Reversed number: " + reversed);
//	        
//	        sc.close();
		
		int baseNumber=1234;
		int reverseNumber=0;
		while(baseNumber!=0) {
			int rem=baseNumber%10;
			reverseNumber=reverseNumber*10+rem;
			baseNumber=baseNumber/10;
		}
		System.out.println("Reserve Number::"+reverseNumber);
			
			
		}
	    }
	
		// TODO Auto-generated method stub




