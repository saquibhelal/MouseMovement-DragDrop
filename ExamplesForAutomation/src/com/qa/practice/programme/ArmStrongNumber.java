package com.qa.practice.programme;

public class ArmStrongNumber {

	public static void isArmStrongNumber(int num){
		int reminder, cube = 0,t=num;
		System.out.println("Given Number is :"+num);
		while(num!=0){
			reminder=num%10;
			num=num/10;
			cube=cube+reminder*reminder*reminder;
		}
		if(t==cube){
			System.out.println("This is ArmStrongNumber");
		}else{
			System.out.println("This is not ArmStrongNumber");
		}
	}
	
	public static void main(String[] args) {
		isArmStrongNumber(153);
		isArmStrongNumber(222);
		isArmStrongNumber(435);

	}

}
