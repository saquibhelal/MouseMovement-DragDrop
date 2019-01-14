package com.qa.practice;

import java.util.ArrayList;

public class SeperateNumberAndString {

	public static void main(String[] args) {
		
		ArrayList<String> strList=new ArrayList<String>();
		ArrayList<Integer> intList=new ArrayList<Integer>();
		ArrayList<Object> li=new ArrayList<Object>();
		li.add("Rehan");
		li.add("Abrahim");
		li.add(5);
		li.add(9);
		
		for(Object ob:li){
			if(ob.getClass().getName().equals("java.lang.String"))
			strList.add(ob.toString());
			else if(ob.getClass().getName().equals("java.lang.Integer"))
				intList.add((Integer)ob);
		}
		
		System.out.println(strList);
		System.out.println(intList);

	}

}
