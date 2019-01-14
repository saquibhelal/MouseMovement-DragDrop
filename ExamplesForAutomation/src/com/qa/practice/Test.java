package com.qa.practice;
import java.io.*;
import java.util.*;
public class Test {


    public static void main(String args[] ) throws Exception {
        
        //Scanner sc = new Scanner(System.in); 
        String test = "This is my test";
        String[] words = test.split(" ");
        for(int i=0;i<words.length;i+=1){
            System.out.print(words[i]+" ");
        }
        
        int j=0,k=words.length-1;
        //logic to reverse the string array
        while(j<k){
            String temp = words[j];
            words[j] = words[k];
            words[k] = temp;
            j++;k--;
        }
        System.out.println();
        for(int i=0;i<words.length;i+=1){
            System.out.print(words[i]+" ");
        }
        // logic to reverse 0th,2nd... string  
        /*for(int i=0;i<words.length;i+=2)
        {
            StringBuilder sb = new StringBuilder(words[i]);
            words[i] = sb.reverse().toString();
        }
        for(int i=0;i<words.length;i+=1){
            System.out.print(words[i]+" ");
        }
        */
        System.out.println();
        for(int i=0;i<words.length;i++)
        {
            if( i%2==0)
            {
                StringBuilder sb = new StringBuilder(words[i]);
                System.out.println(words[i]);
            	int p=0,q=words[i].length()-1;
            	while(p<q){
                char temp = sb.charAt(p);
                sb.setCharAt(p,sb.charAt(q));
                sb.setCharAt(q,temp);
                p++;q--;
            	}  
            	words[i] = sb.toString();
            }
        }
        for(int i=0;i<words.length;i+=1){
            System.out.print(words[i]+" ");
        }
    }
}


