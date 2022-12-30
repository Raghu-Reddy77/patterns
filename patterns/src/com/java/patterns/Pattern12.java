package com.java.patterns;
//   ****
//  ****
// ****
//****
public class Pattern12 {

	public static void solidRhombusPattern(int noRows) {
		// outer loop
		for (int i = 1; i <= noRows; i++) {
			// inner loop -spaces
			for (int spaces = 1; spaces <= noRows - i; spaces++) {
				System.out.print(" ");

			}
			// inner loop - stars
			for (int star = 1; star <= noRows; star++) {
				System.out.print("*");

			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		solidRhombusPattern(4);
	}
}
