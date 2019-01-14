package com.qa.practice;

import java.util.Scanner;

public class StringReverse {
	
	    public static void main(String[] args)
	    {
	    	
	    	
	        /*System.out.println("Enter string to reverse:");
	        
	        Scanner scan = new Scanner(System.in);
	        String str = scan.nextLine();
	        String reverse = "";
	        
	        for(int i = str.length() - 1; i >= 0; i--)
	        {
	            reverse = reverse + str.charAt(i);
	        }
	        
	        System.out.println("Reversed string is:");
	        System.out.println(reverse);
	    }*/
	    	
	    System.out.println("Please enter your string ");
	    @SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
	    String strng=scan.nextLine();
	    String reverse="";
	    int size=strng.length();
	    
	    for(int i=size-1;i>=0;i--){
	    	
	    	reverse=reverse+strng.charAt(i);
	    }
	   System.out.println(reverse);
	    	
	    }    
	   
	}


