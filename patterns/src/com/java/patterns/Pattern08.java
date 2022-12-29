package com.java.patterns;
//1 
//2 3 
//4 5 6 
//7 8 9 10 
//11 12 13 14 15 

public class Pattern08 {
     private static void floydsTraingle_Numbers(int noRows) {
    	 int number=1;
    	 //outer loop
    	 for(int i=1;i<=noRows;i++) {
    		 //inner loop -numbers
    		 for(int j=1;j<=i;j++) {
				System.out.print(number+" ");
				number++;
    		 }
    		 System.out.println();
    	 }
     }
	public static void main(String[] args) {
		floydsTraingle_Numbers(5);

	}

}
