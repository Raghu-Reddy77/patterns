package com.java.patterns;

//****  line=1 star=4   star=star-line+1=4-1+1=4
//***   line=2 star=3   star=star-line+1=3-1+1=3
//**    line=3 star=2
//*     line=4 star=1
 
public class Pattern02 {

	public static void main(String[] args) {
		int n=4;
		//outer loop
		for(int line=1;line<=n;line++) {
			//inner loop 
			for(int star=1;star<=(n-line+1);star++) {
				System.out.print("*");
			}
			System.out.println();
		}
      

	}

}
