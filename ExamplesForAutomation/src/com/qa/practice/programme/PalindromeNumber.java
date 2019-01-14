package com.qa.practice.programme;

public class PalindromeNumber {

	public static void isPalindromeNumber(int num){
		
		int reminder=0,sum=0,temp=num;
		
		System.out.println("Given no is:"+num);
		
		while(num!=0){
			reminder=num%10;
			sum=sum*10+reminder;
			num=num/10;
		}
		
		if(temp==sum){
			System.out.println("It is a Palindrome Number");
		}
		else
		{
			System.out.println("It is not a Palindorme Number");
		}
	}
	
	public static void main(String[] args) {
       isPalindromeNumber(151);
       isPalindromeNumber(285);
       isPalindromeNumber(171);
       isPalindromeNumber(777);
	}

	/*
	 * Output=
	 * 
	    Given no is:151
		It is Palindrome Number
		Given no is:285
		It is not Palindorme Number
		Given no is:171
		It is Palindrome Number
		Given no is:777
		It is Palindrome Number 
	 * 
	 * 
	 */
}
