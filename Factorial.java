package com.to.additionalpgms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int i,number,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number");
		number=sc.nextInt();
		sc.close();
		for(i=1;i<=number;i++)
			fact=fact*i;
		System.out.print("factorial is"+fact);

	}
	}

