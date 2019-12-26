package com.to.cj3;

public class DoWhile {

	public static void main(String[] args) {
		int i=1,j;
		do{
			System.out.println(" ");
			j=1;
			do
			{
				System.out.print("*");
				j++;
				
			}while(j<=i);
			System.out.println();
			i++;
		}while(i<=5);
			
		
		}

	}


