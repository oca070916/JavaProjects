package com.obinna.examples;

public class BeerSong {
	
	public static void main(String[] args) {
		
		int beerNum = 99;
		
		String word = "bottles";
		
		while (beerNum > 0) {
			
			System.out.println(beerNum + " " + word + " of beer on the wall");
			
			System.out.println(beerNum + " " + word + " of beer.");
			
			System.out.println("Take one down.");
			
			System.out.println("Pass it around.");
			
			beerNum -= 1;
			
			if (beerNum > 0) {
				
				if (beerNum == 1) {
					
					word = "bottle";
					
				}  // best location for the above block
				
				System.out.println(beerNum + " " + word + " of beer on the wall");
				
			} else {
				
				System.out.println("No more bottles of beer on the wall");
				
			} // end else section	
			
		} // end while loop
		
	} //end main method

} // end BeerSong class
