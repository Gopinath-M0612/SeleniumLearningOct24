package learning.week2day3;

public class Browser {

	String browserName;
	Float browserVersion;
	
	public void openURL() {
		System.out.println("URL is opened---->browserSuperClass"+browserName);
	}
	
	public void closeBrowser() {
		System.out.println("Browser is closed---->browserSuperClass");
	}
	
	public void navigateBack() {
		System.out.println("Browser is navigated back---->browserSuperClass");
	}
	
}

