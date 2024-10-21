package learning.week1day4;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowserAndLoadUrl {

	public static void main(String[] args) {
		
		//launching chrome driver
		ChromeDriver driver = new ChromeDriver();
		
		//giving url to the browser
		driver.get("https://www.youtube.com/");
		
		//after opening the URL maximizing the window
		driver.manage().window().maximize();
		
		//printing the title of the page
		System.out.println("Title of the page is "+driver.getTitle());
		
		//closing the current window
		driver.close();

	}

}
