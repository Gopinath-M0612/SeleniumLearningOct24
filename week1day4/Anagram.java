package learning.week1day4;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String n = "silent"; // Declare a string variable 'n' and assign it the value "silent"
		String m = "listen"; // Declare a string variable 'm' and assign it the value "listen"

		// Convert the string 'n' into a character array 'a'
		char[] a = n.toCharArray(); // This splits 'n' into individual characters and stores them in 'a'

		// Convert the string 'm' into a character array 'b'
		char[] b = m.toCharArray(); // This splits 'm' into individual characters and stores them in 'b'

		// Sort the character array 'a' in alphabetical order
		Arrays.sort(a); // This rearranges the characters in 'a' from A to Z

		// Sort the character array 'b' in alphabetical order
		Arrays.sort(b); // This rearranges the characters in 'b' from A to Z

		// Check if the sorted arrays 'a' and 'b' are equal
		if (Arrays.equals(a, b)) { // If the sorted characters in 'a' and 'b' match
		    System.out.println("Anagram"); // Print "Anagram" if they are the same
		} else { // If the sorted arrays do not match
		    System.out.println("not anagram"); // Print "not anagram" if they are different

	}

}
}
