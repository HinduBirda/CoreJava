package com.to.basicprograms;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		int i=1;
		int n;
		Scanner sc= new Scanner(System.in);
		n= sc.nextInt();
		sc.close();
		do{
			System.out.println(i);
			i++;
		}while(i<=n);
	}
}

	


