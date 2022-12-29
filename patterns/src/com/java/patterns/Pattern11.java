package com.java.patterns;

public class Pattern11 {
	public static void butterflyPattern(int noRows) {
		// 1st half
		for (int i = 1; i <= noRows; i++) {
			// star -inner loop
			for (int starFirst = 1; starFirst <= i; starFirst++) {
				System.out.print("*");
			}

			// spaces
			for (int space = 1; space <= (2 * (noRows - i)); space++) {
				System.out.print(" ");
			}

			// star -inner loop
			for (int starLast = 1; starLast <= i; starLast++) {
				System.out.print("*");
			}

			System.out.println();
		}
		// 2nd half
		for (int i = noRows; i >=1; i--) {
			// star -inner loop
			for (int starFirst = 1; starFirst <= i; starFirst++) {
				System.out.print("*");
			}

			// spaces
			for (int space = 1; space <= (2 * (noRows - i)); space++) {
				System.out.print(" ");
			}

			// star -inner loop
			for (int starLast = 1; starLast <= i; starLast++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

	public static void main(String[] args) {
		butterflyPattern(4);
	}
}
