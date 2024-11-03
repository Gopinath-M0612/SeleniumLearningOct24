package learning.week2day3;

public class LoginTestData extends TestData{
	
	 void enterUsername(){
		System.out.println("User name has been entered");
	}
	 
	 void enterPassword() {
		 System.out.println("Password has been entered");
	 }

	public static void main(String[] args) {
		
		LoginTestData call = new LoginTestData();
		call.enterCredentials();
		call.navigateToHomePage();
		call.enterUsername();
		call.enterPassword();
		
		
	}

}
