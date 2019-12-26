package com.to.cj2;

import java.util.Scanner;

public class IfElseLadder {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    System.out.println("enter a");
		if(a>0)
			System.out.println("The no. is large");
		else if(a<0)
			System.out.println("the no.is small");
		else
			System.out.println("the no. is equal");

	}

}
