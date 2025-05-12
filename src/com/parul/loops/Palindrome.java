package com.parul.loops;

public class Palindrome {

	private static final int i = 0;

	public static void main(String[] args) {
		int sum =0;

        for (int traverseNumber = 1; traverseNumber <= 1000; traverseNumber++) {
            int baseNumber = traverseNumber;
            int tempcheckNumber = baseNumber;
            int reverseNumber = 0;

            while (baseNumber != 0) {
                int rem = baseNumber % 10;
                reverseNumber = reverseNumber * 10 + rem;
                baseNumber = baseNumber / 10;
            }

            if (tempcheckNumber == reverseNumber) {
                sum++;
                System.out.println(tempcheckNumber + " is a palindrome number");
            }
        }

        System.out.println("Total count of palindrome numbers from 1 to 1000 is: " + sum);
    }
	
}

//				
//			}
//		// TODO Auto-generated method stub

//
//		        for (int i = 1; i <= 1000; i++) {
//		            int reversed = 0, temp = i;
//		            int num = i;
//
//		            while (num != 0) {
//		                int digit = num % 10;
//		                reversed = reversed * 10 + digit;
//		                num /= 10;
//		            }
//
//		            if (reversed == temp) {
//		                reversed++;
//		            }
//		        }
//
//				System.out.println(  + reversed);
		   
