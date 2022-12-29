package com.java.patterns;

public class Pattern09 {
	private static void zeors_Ones(int noRows) {
		// outer loop (no of rows)
		for (int i = 1; i <= noRows; i++) {
			// inner loop (use box to find solution)
			for (int j = 1; j <= noRows; j++) {
				if ((i + j) % 2 == 0) { // even
					System.out.print("1");
				} else {
					System.out.print("0");
				}
			}
			System.out.println();
		}

	}
	public static void main(String[] args) {
		zeors_Ones(5);
	}
}
