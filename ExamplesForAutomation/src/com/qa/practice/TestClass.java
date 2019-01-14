package com.qa.practice;

import java.io.*;
import java.util.*;



class TestClass {
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
       /* for(int i=0;i<words.length;i++)
        {
            if( j%2==0)
            {
                int p=0,q=words.length-1;
            //logic to reverse the string array
            while(p<q){
                char temp = words[j].charAt(p);
                words[j].charAt(p) = words[j].charAt(q);
                words[j].charAt(q) = temp;
                p++;q--;
            }
                    
            }
        }*/
    }
}
