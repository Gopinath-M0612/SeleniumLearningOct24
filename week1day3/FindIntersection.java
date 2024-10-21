package learning.week1day3;

public class FindIntersection {

	public static void main(String[] args) {
		
		
		int[] a = {3,2,11,4,6,7}; //declaring integer type of array with variable name a
		int[] b = {1,2,8,4,9,7}; //declaring integer type of array with variable name b
		
		//using enhanced for loop to get each values of a in to set1   
		for(int set1 : a) //using enhanced for loop to get each values of a[] in to set1
		{
			for(int set2 : b) //using enhanced for loop to get each values of b[] in to set2
			{
				if(set2 == set1) //compares set1 and set2
				{
					System.out.println(set1); //print the matching element in set1
				}
			}
		}
	}

}
