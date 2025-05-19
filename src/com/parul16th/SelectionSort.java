package com.parul16th;

public class SelectionSort {

	public static void main(String[] args) {


		        int[] arr = {5, 8, 3, 1};

		        // Selection Sort Algorithm
		        for (int i = 0; i < arr.length; i++) {
		            int min_index = i;
		            for (int j = i + 1; j < arr.length; j++) {
		                if (arr[j] < arr[min_index]) {
		                    min_index = j;
		                }
		            }
		            // Swap only if needed (optional optimization)
		            if (min_index != i) {
		                int temp = arr[i];
		                arr[i] = arr[min_index];
		                arr[min_index] = temp;
		            }
		        }

		        // Output the sorted array
		        System.out.println("Sorted array:");
		        for (int ele : arr) {
		            System.out.println(ele);
		        }
		    }
		

		// TODO Auto-generated method stub

	}

