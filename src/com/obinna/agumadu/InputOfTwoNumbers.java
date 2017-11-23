package com.obinna.agumadu;

import java.util.*;				// needed in order for Scanner to work


public class InputOfTwoNumbers {
	
	public static void main(String[] args) {
		
		//use scanner to read in values
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your 1st number: ");
		
		double number1 = scanner.nextDouble();
		
		System.out.println("Enter your 2nd number: ");
		
		double number2 = scanner.nextDouble();
		
		scanner.close(); 
		//good to close out scanner to prevent memory leaks
		
		System.out.println("The sum of your 2 numbers, " + number1
				+ " AND " + number2 + " is " + (number1 + number2));
		
		
		
		
		
	}

}
