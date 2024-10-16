package learning.week1day2;

public class CheckNumberIsPositive {

	public static void main(String[] args) {
		
		int version = 10;
		
		if(version >= 1)
		{
			System.out.println(version+" is positive");
		}
		else if(version == 0) {
			System.out.println(version+" is nuetral");
		}
		else
			System.out.println(version+" is negative");
		
	}

}