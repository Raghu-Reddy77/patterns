package com.java.patterns;

//*
//**
//***
//****

public class Pattern01 { 

	public static void main(String[] args) {

		// outer loop
		for (int line = 1; line <= 4; line++) {
			// inner loop
			for (int star = 1; star <= line; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
