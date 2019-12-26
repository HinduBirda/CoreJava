package com.to.additionalpgms;

public class LogicalOperators {

	public static void main(String[] args) {
		int a=4,b=5,c=3;
		if((a>b)&&(a>c)){
			System.out.println("a is the greatest");
		}
		else if((a<b)||(b>a)){
			System.out.println("b is the greatest");
		}
		else
			System.out.println("c is the greatest");
			
		

	}

}
