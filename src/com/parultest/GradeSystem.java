package com.parultest;

import java.util.Scanner;

public class GradeSystem {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = scanner.nextInt();

        if (marks >= 90) {
            System.out.println("O Grade");
        } else if (marks >= 75) {
            System.out.println("A Grade");
        } else if (marks >= 55) {
            System.out.println("B Grade");
        } else if (marks >= 40) {
            System.out.println("C Grade");
        } else {
            System.out.println("Fail");
        }
    }
}

		// TODO Auto-generated method stub



