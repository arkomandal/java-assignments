package assignment20220217;
// Write a Java program to get a set of view of the keys contained in this map.
import java.util.*;
public class Ques3 {
	public static void main(String[] args) {

		Map<Integer, String> movie = new HashMap<Integer, String>();

		movie.put(1, "Spiderman 1");
		movie.put(2, "2002");
		movie.put(3, "10");
		
		for(Map.Entry<Integer, String> e : movie.entrySet()) {
			 System.out.println(e.getKey());
		}
	}
}
