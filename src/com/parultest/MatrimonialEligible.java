package com.parultest;

import java.util.Scanner;

public class MatrimonialEligible {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 System.out.print("Enter your gender (male/female): ");
	        String gender = scan.nextLine().toLowerCase();
	        
	        System.out.print("Enter your age: ");
	        int age = scan.nextInt();
	        
	        boolean eligible = false;

	        if (gender.equals("male") && age >= 21) {
	            eligible = true;
	        } else if (gender.equals("female") && age >= 18) {
	            eligible = true;
	        }

	        if (eligible) {
	            System.out.println("You are eligible to register on the matrimonial site.");
	        } else {
	            System.out.println("You are not eligible to register on the matrimonial site.");
	        }

	        scan.close();
	    }
}
	