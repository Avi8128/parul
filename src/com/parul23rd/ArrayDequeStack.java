package com.parul23rd;

import java.util.ArrayDeque;

public class ArrayDequeStack {

	public static void main(String[] args) {
		/// TODO Auto-generated method stub
		
		ArrayDeque<String> arraydeque=new ArrayDeque();
		arraydeque.push("Java");
		arraydeque.push("Python");
		arraydeque.push("HTML");
		
		while(!arraydeque.isEmpty()) {
			System.out.println(arraydeque.pop());
		}
	}

}