package learning.week1day4;

public class ReverseString {

	public static void main(String[] args) {
		
		String name = "kandan";
		char[] reverse = name.toCharArray();
		System.out.println(reverse);
		for(int i = reverse.length-1; i >= 0; i--) {
			System.out.print(reverse[i]);
		}
		

	}

}
