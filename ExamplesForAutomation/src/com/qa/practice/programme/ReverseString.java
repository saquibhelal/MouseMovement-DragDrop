package com.qa.practice.programme;

public class ReverseString {

	public static void isReverseString(String sentence){
		String word = sentence,rev="";
		int lenght=word.length();
		
		System.out.println("Given String is: "+ sentence);
		for(int i=lenght-1;i>=0;i--){
			rev=rev+word.charAt(i);
		}
		System.out.println("Revesre of "+word + " is " + "\n" +rev);
	}
	
	public static void main(String[] args) {

		isReverseString("Rehan");
		isReverseString("Abrahim");
		
		
		
	}

}
