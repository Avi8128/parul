package com.parul23rd;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// // TODO Auto-generated method stub
		Stack<String> bookDetails = new Stack<String>();
		bookDetails.add("Atomic Study");
		bookDetails.add("Java Basic");
		bookDetails.add("Python Basic");
		
		while(!bookDetails.isEmpty()) {
			System.out.println(bookDetails.pop());
		}
	}
	
}