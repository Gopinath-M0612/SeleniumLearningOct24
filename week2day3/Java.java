package learning.week2day3;

public class Java {
	
	public void reportStep(String message, String status) {
		System.out.println(message+" "+status);
	}
	
	public void reportStep(String message,String status,boolean snap) {
		System.out.println(message+" "+status+" "+snap);
	}

	public static void main(String[] args) {
		
		Java cr = new Java();
		cr.reportStep("Hello is the message","Received");
		cr.reportStep("Hi is the message", "received", true);

	}

}
