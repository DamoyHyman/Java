public class Q3 
{
	public static void main(String[] args) 
	{
		RatingScore movieRating = new RatingScore();  
		movieRating.initialize("Joe's excellent movie", 5); 
		
		RatingScore restaurantRating = new RatingScore(); 
		restaurantRating.initialize("Food quality", 10); 
		System.out.println("\t Rating Score");
		movieRating.readRating();
		restaurantRating.readRating();
		
		System.out.println(movieRating.display());
		System.out.println(restaurantRating.display());

	}

}
