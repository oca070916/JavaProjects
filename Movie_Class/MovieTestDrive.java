
public class MovieTestDrive {
	
	public static void main(String[] args) {
		
		Movie one = new Movie();
		
		one.setTitle("Gone With The Wind");
		
		one.setGenre("Romance");
		
		one.setRating(6);
		
		Movie two = new Movie();
		
		two.setTitle("Back To the Future");
		
		two.setGenre("Sci-fi");
		
		two.setRating(11);
		
		System.out.println("I wnat to watch " + two.getTitle());
		
		two.playIt();
		
		Movie three = new Movie();
		
		three.setTitle("Godzilla");
		
		three.setGenre("Action");
		
		three.setRating(4);
		
		
		
				
	}

}
