package learning.week1day3;

import java.util.Arrays;

public class FindingMissingElementOnArray {

	public static void main(String[] args) {
		
int a[] = {1, 2, 3, 4, 6, 7, 8}; // Declare and initialize an array 'a' with some numbers (missing 5)
		
		int b[] = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // Declare and initialize an array 'b' with a complete set of numbers from 1 to 9

		// Start a loop to go through each element in array 'b'
		for (int i = 0; i < b.length; i++) { // 'i' is the index for array 'b'
			
		    boolean found = true; // Assume the number is not found in 'a' by default
		    
		    // Start a loop to go through each element in array 'a'
		    for (int j = 0; j < a.length; j++) { // 'j' is the index for array 'a'
		    	
		        // Check if the current element in 'b' matches any element in 'a'
		        if (b[i] == a[j]) { // If the number in 'b' is found in 'a'
		            found = false; // Set found to false, since it exists in both arrays
		            break; // Exit the inner loop since we found a match
		        }
		    }
		    
		    // If the number in 'b' was not found in 'a'
		    if (found) { // Check if found is still true
		        System.out.println(b[i]); // Print the number from 'b' that is missing in 'a'
		
		
	}	
	}

			}
		}
		



