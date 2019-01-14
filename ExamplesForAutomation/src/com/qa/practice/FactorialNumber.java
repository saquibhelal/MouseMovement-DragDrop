package com.qa.practice;

public class FactorialNumber {

	public static void main(String[] args) {
		int number=6,c, fact=1;
		if(number<0)
			System.out.println("Number should not be non negative");
		else{
			for(c=1;c<=number;c++)
				fact=fact*c;
			System.out.println("Factorial of given number is:"+fact);
		}

	}

}
