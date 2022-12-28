package com.java.patterns;
//1
//12
//123
//1234


public class Pattern3 {

	public static void main(String[] args) {
		// outer loop (how many lines =4  )
		for(int i=1;i<=4;i++) {
			//inter loop 
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
