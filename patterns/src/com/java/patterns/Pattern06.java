package com.java.patterns;
//      *
//     **
//    ***
//   ****
//  *****
// ******
//*******
public class Pattern06 {
     
	public static void rotate_Left_Traingle(int noRows){
		//outer loop
		for(int i=1;i<=noRows;i++) {
			//inner loop (spaces) 
			for(int space=1;space<=noRows-i;space++) {
				System.out.print(" ");
			}
			//inner loop (stars)
			for(int star=1;star<=i;star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		rotate_Left_Traingle(7);

	}

}
