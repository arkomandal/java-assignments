package assignment20220217;

public class Movie implements Comparable<Movie>{
	
	private String name;
	private int year;
	private int rating;
	
	public Movie(String name, int year, int rating) {
		this.name = name;
		this.year = year;
		this.rating = rating;
	}
	
	public int compareTo(Movie m) {
		return this.year - m.year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
}
