package com.qa.practice.programme;

public class Fibo {

	public static void main(String[] args) {

		int a=0,b=1,sum;
		System.out.println(a + "" + b);
		for(int i=1;i<=5;i++){
			sum=a+b;
			System.out.println(""+sum);
			a=b;
			b=sum;
		}
	}

}
