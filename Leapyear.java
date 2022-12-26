package com.day1practice;

import java.util.Scanner;

public class Leapyear {
	static int year;

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter the Year: ");
			year =sc.nextInt();
		}
		if(year>=1582) {
		if(((year%4==0) && (year % 100 != 0)) || (year % 400 ==0))
		{
			System.out.println("The "+year+" year are leap");
		}
		else
		{
			System.out.println("The "+year+" year are not leap");
		}
		}
		else
		{
			System.out.println("Please enter year greater than 1582");
		}

	}

}


