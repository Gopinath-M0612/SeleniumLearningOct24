package learning.week1day2;

public class ToFindFibonacciSeries {

	public void fibSer(int n) 
	{
		//initialization
		int first = 0, second = 1, third;
		
		//printing first and second value
		System.out.print(first+","+second);
		
		//for loop for generating fibonacci series 
		for(int i = 0; i <= n; i++)
		{
			if(first < n)
			{
				third = first+second;
				first = second;
				second = third;
				System.out.print(","+third);
			}
		}
		
		
		
	}
	
	public static void main(String[] args) {
		
		ToFindFibonacciSeries range = new ToFindFibonacciSeries();
		range.fibSer(8);
		
	}

}
