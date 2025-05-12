package com.parultest;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter the age::");
		
		int age=scan.nextInt();
		if(age>=18) {
			System.out.println("person elibible for voting");
		}else {
			System.out.println("person is not eligible for voting");
		}
		// TODO Auto-generated method stub

	}

}
