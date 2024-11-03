package learning.week2day3;

public class OverRiding extends Java{
	
	public void reportStep(String message, String status,int num) {
		System.out.println(message+" "+status+" "+num);
	}
	
	public void reportStep(String message,String status,boolean snap) {
		System.out.println(message+" "+status+" "+snap);
	}

	public static void main(String[] args) {
		
	OverRiding oR = new OverRiding();
	oR.reportStep("Hello", "Delivered", 3);

	}

}
