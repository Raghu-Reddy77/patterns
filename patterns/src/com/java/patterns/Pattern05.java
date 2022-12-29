package com.java.patterns;

//
//*****  (1,1) (1,2) (1,3) (1,4) (1,5)
//*   *
//*   *
//*****


public class Pattern05 {
	
	public static void hallowRectangle(int rows,int cols){
		//outer loop
		for(int i=1;i<=rows;i++) {
			//inner loop
			for(int j=1;j<=cols;j++) {
				//condition
				if(i==1||i==rows||j==1||j==cols) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		hallowRectangle(40, 50);

	}

}
