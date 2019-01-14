package com.qa.practice;

import java.util.Arrays;

public class StringExample {

	public static void main(String[] args) {
		String test = "123Rama456";
		String[] words = test.split("");
		System.out.println(Arrays.toString(words));
		for(int i=0;i<words.length;i++)
		{
			if(Character.isLetter(words[i].charAt(0)))
			{
				int firstLetterIndex = i;
				String fLetterValue = words[i];
				i++;
				while(Character.isLetter(words[i].charAt(0)))
				{
					words[firstLetterIndex++] = words[i++];
				}
				words[firstLetterIndex] = fLetterValue;
			}
		}
		System.out.println(Arrays.toString(words));
		String result=String.join("",words);
		System.out.println();
		System.out.println(result);
		}
}