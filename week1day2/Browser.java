package learning.week1day2;

public class Browser {
	String launchBrowser(String browserName){
		System.out.println(browserName+ " browser launched successfully");
		return browserName;
	}
	
	void loadUrl(){
		System.out.println("Application Url launched successfully");
	}
	
	public static void main(String[] args) {
		
		Browser g = new Browser();
		g.launchBrowser("Chrome");
		g.loadUrl();
	}
}
 