package com.java.patterns;

public class Pattern13 {
	public static void rhombus(int noRows) {
		// outer loop
		for (int i = 1; i <= noRows; i++) {
			// inner loop - spaces
			for (int spaces = 1; spaces <= (noRows - i); spaces++) {
				System.out.print(" ");
			}

			// inner loop - stars
			for (int stars = 1; stars <= noRows; stars++) {
				if (i == 1 || i == noRows || stars == 1 || stars == noRows) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}
	}

	public static void main(String[] args) {
		rhombus(5);
	}

}
