package com.java.patterns;

//12345
//1234
//123
//12
//1

public class Pattern07 {
    private static void inverveted_Half_Pyramid(int noRows) {
    	//outer loop
    	for(int i=1;i<=noRows;i++) {
    		//inner loop (condition = number of rows - lines +1 )
    		for(int j=1;j<=(noRows-i+1);j++) {
    			System.out.print(j);
    		}
    		System.out.println();
    	}
    }
	public static void main(String[] args) {
		inverveted_Half_Pyramid(5);
	}

}
