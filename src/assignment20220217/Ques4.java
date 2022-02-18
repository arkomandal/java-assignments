package assignment20220217;

import java.util.*;

//Write a Java program to sort a predefined HashMap on it's value.

public class Ques4 {

	public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> marksheet) {
		
		List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(marksheet.entrySet());

		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});

		HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
		for (Map.Entry<String, Integer> aa : list) {
			temp.put(aa.getKey(), aa.getValue());
		}
		
		return temp;
	}

	public static void main(String[] args) {
		
		HashMap<String, Integer> marksheet = new HashMap<String, Integer>();

		marksheet.put("Math", 98);
		marksheet.put("Data Structure", 85);
		marksheet.put("Database", 91);
		marksheet.put("Java", 95);
		marksheet.put("Operating System", 79);
		marksheet.put("Networking", 80);

		Map<String, Integer> sortedMarksheet = sortByValue(marksheet);

		
		for (Map.Entry<String, Integer> subject : sortedMarksheet.entrySet()) {
			System.out.println("Key = " + subject.getKey() + ", Value = " + subject.getValue());
		}
	}
}