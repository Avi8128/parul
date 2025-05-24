package com.parul23rd;

import java.util.Stack;

public class StackOperations {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.add(10);
		s.push(20);
		s.addElement(10);;
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}
		Integer top= s.peek();
		System.out.println(top);
		System.out.println(top.SIZE);
	}
}