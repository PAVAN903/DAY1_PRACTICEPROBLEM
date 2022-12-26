package com.day1practice;

public class Commandline {
	static int sum =0;

	public static void main(String[] args) {
		
		System.out.println("Calculates Sum of below Integers");
		
		for(int i=0;i<args.length;i++){
			System.out.println(args[i]);
			try {
			sum = sum + Integer.parseInt(args[i]);
			} catch (NumberFormatException e) {
			System.out.println("Invalid integer command line arguments: " + e.toString());
			}
		}
		System.out.println("Sum :" + sum);
		}
}
	


