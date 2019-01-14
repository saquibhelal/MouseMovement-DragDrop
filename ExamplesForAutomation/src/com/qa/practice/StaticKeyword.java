package com.qa.practice;

public class StaticKeyword {

	static int num;
	   static String mystr;
	   //First Static block
	   static{
		   num = 68;
		   mystr = "Rehan You Are in Block1";
	      System.out.println("Static Block "+num);
	      System.out.println("Static Block "+mystr);
	     // System.exit(0);
	      
	  } 
	  //Second static block
	  static{
		  num = 98;
	      mystr = "Abrahim You Are in Block2 ";
	      System.out.println("Static Block "+num);
	      System.out.println("Static Block "+mystr);
	      System.exit(0);
	  } 
		  
		  public static void main(String args[])
		  {
		      System.out.println("Value of num: "+num);
		      System.out.println("Value of mystr: "+mystr);
		   }

}
