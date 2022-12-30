package com.java.patterns;

public class Pattern15 {
	public static void DiamondPattern(int noRows) {
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
		// 2ndhalf
		for (int i = noRows; i >= 1; i--) {
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
		DiamondPattern(8);
	}
}
