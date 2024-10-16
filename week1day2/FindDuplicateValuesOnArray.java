package learning.week1day2;

import java.util.Arrays;

public class FindDuplicateValuesOnArray {

	public static void main(String[] args) {
		
		
		int num[] = {4,8,99,55,36,3,4,8,90,91,55};
		int tL = num.length;
		System.out.println("Length of an array is "+tL);
		Arrays.sort(num);
		System.out.println("After sorting the min value of an array is "+num[0]);
		
		//To find duplicate values in array
		for(int i = 0; i < num.length-1; i++)
		{
			if(num[i] == num[i+1])
			{
				System.out.println("The duplicated values in array are: "+ num[i]);
			}
		}
		
		
			}
		}
	

		
		
		

	


