package com.to.basicprograms;

public class Pattern1 {

	public static void main(String[] args) {
		int n=5;
		int z=1;
		int i,j,k;
		for(i=1;i<=n;i++){
			for(j=n-1;j>=i;j--){
				System.out.print(" ");
			}
			for(k=0;k<z;k++){
				System.out.print(i);

			}
			z+=2;
			System.out.println();
		}

	}

}
