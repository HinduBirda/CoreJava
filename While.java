package com.to.cj3;

public class While {

	public static void main(String[] args) {
		int i=1,j;
		while(i<=5)
		{
		
			System.out.println();
			j=1;
			while(j<=i)
			{
				System.out.print("*");
				j++;
			}
			i++;
		}

	}

}
