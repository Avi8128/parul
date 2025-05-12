package com.parul10th;

public class JaggArray {

	public static void main(String[] args) {
		int[][] jaggArrayObj= new int [5][];
		jaggArrayObj[0] = new int[3];
		jaggArrayObj[1] = new int[5];
		jaggArrayObj[2] = new int[1];
		jaggArrayObj[3] = new int[2];
		jaggArrayObj[4] = new int[2];
		// 1st row
		jaggArrayObj[0][0]=48;
		jaggArrayObj[0][1]=53;
		jaggArrayObj[0][2]=49;
		//2nd row
		jaggArrayObj[1][0]=20;
		jaggArrayObj[1][1]=60;
		jaggArrayObj[1][2]=80;
		jaggArrayObj[1][3]=90;
		jaggArrayObj[1][4]=0;
		// 3rd row
		jaggArrayObj[2][0]=35;
		//4th row
		jaggArrayObj[3][0]=40;
		jaggArrayObj[3][1]=48;
		//5th row
		jaggArrayObj[4][0]=60;
		jaggArrayObj[4][1]=70;
				
		
		for (int i=0;i<jaggArrayObj.length;i++) {
			for(int j = 0;j<jaggArrayObj[i].length;j++) {
				System.out.print(jaggArrayObj[i][j]);
			}
			System.out.println();
		}
		
//		// TODO Auto-generated method stub
int value = 1; // starting value to assign
		
		// Assign values using nested loops
		for (int i = 0; i < jaggArrayObj.length; i++) {
			for (int j = 0; j < jaggArrayObj[i].length; j++) {
				jaggArrayObj[i][j] = value;
				value++;
			}
		}

		// Print using enhanced for-each loop
		for (int[] row : jaggArrayObj) {
			for (int val : row) {
				System.out.print(val + " ");
			}
			System.out.println();
		}
		

	}

}
