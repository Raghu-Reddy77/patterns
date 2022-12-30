package com.java.patterns;
//    1 
//   2 2 
//  3 3 3 
// 4 4 4 4 
//5 5 5 5 5 
public class Pattern16 {
	public static void numberPyramid(int noRows) {
		// outer loop
		for (int i = 1; i <= noRows; i++) {
			// spaces
			for (int spaces = 1; spaces <= (noRows - i); spaces++) {
				System.out.print(" ");
			}
			for (int stars = 1; stars <= i; stars++) {
				System.out.print(i + " ");
			}
			System.out.println();

		}
	}

	public static void main(String[] args) {
		numberPyramid(5);
	}
}
