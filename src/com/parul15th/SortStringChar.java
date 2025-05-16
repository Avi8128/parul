package com.parul15th;

import java.util.Arrays;

public class SortStringChar {

	public static void main(String[] args) {
		String name = "bharat";

        // Convert string to a char array
        char[] chars = name.toCharArray();

        // Sort the char array
        Arrays.sort(chars);

        // Convert back to string
        String sortedName = new String(chars);

        // Print result
        System.out.println("Sorted string: " + sortedName);
    }

}



		// TODO Auto-generated method stub

	


