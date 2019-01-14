package com.qa.practice;

public class ReverseString {

	public static void main(String[] args) {
		String test="This is my test";
		String[] words=test.split(" ");
		for(int i=0;i<words.length;i+=1){
			System.out.println(words[i]+" ");
		}
          int j=0,k=words.length-1;
          //logic to reverse the string array
          while(j<k){
        	  String temp=words[j];
        	  words[j]=words[k];
        	  words[k]=temp;
        	  j++;
        	  k--;
          }
          System.out.println();
          // logic to reverse 0th,2nd.. string
          for(int i=0;i<words.length;i+=2){
        	  StringBuilder sb=new StringBuilder(words[i]);
        	  words[i]=sb.reverse().toString();
          }
          for(int i=0;i<words.length;i+=1){
        	  System.out.println(words[i]+" ");
          }
	}

}
