package assignment20220217;

import java.util.*;

// Create a list of movies (name, year and rating) and sort the list based on each property.

public class Ques2 {
	public static void main(String[] args) {

		ArrayList<Movie> movies = new ArrayList<Movie>();
		movies.add(new Movie("Spiderman 1", 2000, 8));
		movies.add(new Movie("Spiderman 2", 2003, 8));
		movies.add(new Movie("Spiderman 3", 2007, 7));

		Collections.sort(movies);

		for (Movie movie : movies) {
			System.out.println(
					"name: " + movie.getName() + ", year: " + movie.getYear() + ", rating: " + movie.getRating());
		}

	}
}