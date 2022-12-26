package com.day1practice;

import java.util.Scanner;

public class Uc3_string {

	public static void main(String[] args) {
		String str1,str2;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the first string");
		str1=sc.nextLine();
        
		System.out.println("enter the second string");
		str2=sc.nextLine();
		
		if(str1.equals(str2)) {
			System.out.println("two strings are equal");
		}
		else 
			System.out.println("two strings are not equal");
				
			}
		
	
}

