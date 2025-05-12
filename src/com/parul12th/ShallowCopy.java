package com.parul12th;

public class ShallowCopy {

	public static void main(String[] args) {
//		int [] arr= {10,20,30,40};
//		
//		int [] copyArr=arr;
//		
//		
//		
//		for(int ele:copyArr)
//			System.out.println("element is::"+ele);
		int[] arr = {1,2,3,4,5,6};
		int[] shallowcopyarr = arr;
		shallowcopyarr[2] = 30;
		
		System.out.println("Simple Array");
		for(int i = 0 ; i<arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n\nShallow Copy of the Array");
		
		for(int i = 0 ; i<shallowcopyarr.length ; i++) {
			System.out.print(shallowcopyarr[i]+" ");
		}
		
		int[] deepcopy = new int[arr.length];
		
		for (int i = 0; i < deepcopy.length; i++) {
			deepcopy[i] = arr[i];
		}
		
		System.out.println("\n\nDeep Copy of the Array");
		for (int i = 0; i < deepcopy.length; i++) {
			System.out.print(deepcopy[i]+" ");
		}
//		// TODO Auto-generated method stub

	}

}
