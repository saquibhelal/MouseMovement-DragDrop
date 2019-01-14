package com.qa.practice.programme;

public class FactorialNumber {

	//1: Option without recursion 
	public static int isFactorial(int num){
		
		int fact=1;
		
		System.out.println("Given number is:"+num);
		if(num==0)
			return 1;
		
		for(int i=1;i<=num;i++){
			
			fact=fact*i;
		}
		return fact;
	}
	
	//2: Option with recurssion 
	public static int fact(int num){
		//System.out.println("Given number is:"+num);
		if(num==0)
			return 1;
		else
			return(num *fact(num-1));
	}
	
	public static void main(String[] args) {
		System.out.println(isFactorial(4));
        System.out.println(fact(3));
	}

}
