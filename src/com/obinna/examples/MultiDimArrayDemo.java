package com.obinna.examples;

public class MultiDimArrayDemo {
	
	public static void main(String[] args) {
		
		String[][] names = {
				{"Mr. ", "Mrs. ", "Ms. ", "Dr. "},
				{"Calloway", "Burns", "Johnson", "McKay", "Takagi"}
				
		};
		
		//Mr. Burns
		System.out.println(names[0][0] + names[1][1]);
		
		//Mrs. Calloway
		System.out.println(names[0][1] + names[1][0]);
		
		//Ms. Takagi
		System.out.println(names[0][2] + names[1][4]);
		
		//Dr. Johnson
		System.out.println(names[0][3] + names[1][2]);
		
		
		
		//array's length  --> 2, which makes sense, 2d array
		System.out.println(names.length);
		
	}

}
