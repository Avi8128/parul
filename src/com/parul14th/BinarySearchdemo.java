package com.parul14th;

public class BinarySearchdemo {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40};
		int target=20;
		
		int left=0;
		
		int right=arr.length-1;
		
		while(left<right) {
			int mid=(left+right)/2;
			if(arr[mid]==target)
			{
				System.out.println("target found at index::"+mid);
				break;
			}
			else if(arr[mid]<target) {
				left=mid+1;
			}else {
				right=mid-1;
			}
		}
		
		// TODO Auto-generated method stub

	}

}
