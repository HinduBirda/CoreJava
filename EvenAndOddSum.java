package com.to.basicprograms;

import java.util.Scanner;

public class EvenAndOddSum {
	public static void main(String[] args) {

	int n,i,evensum=0,oddsum=0;
	Scanner sc= new  Scanner(System.in);
	System.out.println("enter n");
	n=sc.nextInt();


		int a[]=new int[n];
		System.out.println("enter n");
		for( i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		sc.close();
			for(i = 0; i < n; i++)
			{
				if(a[i] % 2 == 0)
				{
					evensum = evensum + a[i]; 
				}
				else
				{
					oddsum = oddsum + a[i]; 
				}
			}		
			System.out.println("\n The Sum of Even Numbers in this Array = " + evensum);
			System.out.println(" The Sum of Odd Numbers in this Array = " + oddsum);
			
		}
		
		
		

	}
	
