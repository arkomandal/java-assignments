package assignment20220217;

import java.util.ArrayList;

// Write a Java program to replace the second element of ArrayList with the specified element.

public class Ques1 {
	public static void main(String[] args) {
		
		int n = 5;
		
		ArrayList<Integer> arrlist = new ArrayList<Integer>(n);
		
		for (int i = 1; i <= n; i++) {
			arrlist.add(i);
		}
		System.out.print(arrlist);
		
		int newEl=100;
		arrlist.set(1, newEl); // Replacing at index 1
		
		System.out.print(arrlist);
		
	}
}
