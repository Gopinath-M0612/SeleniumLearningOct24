package learning.week1day4;

public class Palindrome {

	public static void main(String[] args) {
		
		String g = "racecar"; // Declare a string variable 'g' and assign it the value "racecar"
		String o = ""; // Declare an empty string variable 'o' to store the reversed version of 'g'

		// Start a loop that goes from the last character of 'g' to the first character
		for (int i = g.length() - 1; i >= 0; i--) { // 'i' starts at the last index of 'g' and decrements to 0
		    o = o + g.charAt(i); // Append the character at index 'i' of 'g' to the end of 'o'
		}

		// Print the reversed string 'o' to the console
		System.out.println(o);

		// Check if the original string 'g' is the same as the reversed string 'o'
		if (g.equals(o)) { // If 'g' is equal to 'o'
		    System.out.println("palindrome"); // Print "palindrome" if they are the same
		} else { // If 'g' is not equal to 'o'
		    System.out.println("Not palindrome"); // Print "Not palindrome" if they are different
		}
		
	}

}
