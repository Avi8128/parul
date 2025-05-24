package com.parul23rd;

import java.util.Stack;

public class Reverse_Stack {

	public static void main(String[] args) {
		Stack<String> s = new Stack();
		Stack<String> sc = new Stack();
		
		s.push("Java");
		s.push("Spring");
		s.push("Microservices");
		s.push("React");
		while(!s.isEmpty()) {
			
			sc.push(s.pop());
		}
		while(!sc.isEmpty()) {
			System.out.println(sc.pop());
		}

	}

}