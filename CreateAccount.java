package learning.week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) {
		
		//initializing the web driver
		ChromeDriver driver = new ChromeDriver();
		
		//passing URL to open in browser
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//maximizing the window
		driver.manage().window().maximize();
		
		//Enter user name  
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		//Enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//click on login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//click on CRM?SFA link
		driver.findElement(By.id("label")).click();
		
		//click on Accounts tab
		driver.findElement(By.linkText("Accounts")).click();
		
		//click on create account tab
		driver.findElement(By.linkText("Create Account")).click();
		
		//Enter an account name
		driver.findElement(By.id("accountName")).sendKeys("Testelkkkkkk");
		
		//passing words to description
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		//Enter number of employees
		driver.findElement(By.id("numberEmployees")).sendKeys("5");
		
		//enter site name
		driver.findElement(By.id("officeSiteName")).sendKeys("Test leaf");
		
		//verify the title is displayed
		boolean title = driver.findElement(By.className("requiredField")).isDisplayed();
		System.out.println(title);
		
		//click on create account tab
		driver.findElement(By.className("smallSubmit")).click();
		
		//closing the window
		driver.close();
		
		
	
	}

}
