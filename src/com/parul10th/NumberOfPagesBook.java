package com.parul10th;

public class NumberOfPagesBook {

	public static void main(String[] args) {
		int[][] bookObj = new int[4][];
		
		//insertation of data 
		bookObj [0]= new int [2];
		bookObj [1]= new int [3];
		bookObj [2]= new int [4];
		bookObj [3]= new int [4];
		// TODO Auto-generated method stub
		//1st submodule
		bookObj [0][0]= 10;
		bookObj [0][1]= 8;
		// 2nd submodule
		bookObj [1][0]= 8;
		bookObj [1][1]= 4;
		bookObj [1][2]= 9;
		//3rd submodule
		bookObj [2][0]= 2;
		bookObj [2][1]= 3;
		bookObj [2][2]= 9;
		bookObj [2][3]= 8;
		//4th submodule
		bookObj [3][0]= 10;
		bookObj [3][1]= 12;
		bookObj [3][2]= 6;
		bookObj [3][3]= 8;
		int totalNumberofPage =0;
		


		for (int i = 0; i < bookObj.length; i++) {
			for (int j = 0; j < bookObj[i].length; j++) {
				System.out.print(bookObj[i][j] + " ");
				totalNumberofPage += bookObj[i][j];
			}
			System.out.println();
		}
		
		System.out.println("Total number of pages: " + totalNumberofPage);
	}
}