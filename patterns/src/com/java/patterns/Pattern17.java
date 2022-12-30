package com.java.patterns;

public class Pattern17 {
	public static void numberPalindrome(int noRows) {
		//outer loop
		
	for(int i=1;i<=noRows;i++) {
		//spaces
		for(int spaces=1;spaces<=(noRows-i);spaces++) {
			System.out.print(" ");
		}
		for(int number=i;number>=1;number--) {
			System.out.print(number);
		}
		for(int number=2;number<=i;number++) {
			System.out.print(number);
		}
		
		System.out.println();
		
	}
		
	}
	public static void main(String[] args) {
      numberPalindrome(5);
	}
}
