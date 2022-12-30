package com.java.patterns;
//    *
//   ***
//  *****
// *******
//*********
public class Pattern14 {
	public static void pyramid(int noRows) {
		// 1sthalf
		for (int i = 1; i <= noRows; i++) {
			// spaces
			for (int spaces = 1; spaces <= (noRows - i); spaces++) {
				System.out.print(" ");
			}
			// stars (2i-1)
			for (int stars = 1; stars <= ((2 * i) - 1); stars++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		pyramid(5);
	}
}
