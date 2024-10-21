package learning.week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountUsingSelectClass {

	public static void main(String[] args) {
		
		//Launching browser
		ChromeDriver driver = new ChromeDriver();
		
		//pass the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Maximizing the browser window
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
		driver.findElement(By.id("accountName")).sendKeys("key");
		
		//passing words to description
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		//select industry
		WebElement element = driver.findElement(By.name("industryEnumId"));
		Select industry = new Select(element);//importing select class
		industry.selectByValue("IND_SOFTWARE");//select as computer industry
		
		//Select ownership
		WebElement element2 = driver.findElement(By.name("ownershipEnumId"));
		Select ownerShip = new Select(element2);
		ownerShip.selectByVisibleText("S-Corporation");
		
		//Select source
		WebElement element3 = driver.findElement(By.id("dataSourceId"));
		Select source = new Select(element3);
		source.selectByValue("LEAD_EMPLOYEE");
		
		//selecting Marketing Campaign 
		WebElement element4 = driver.findElement(By.id("marketingCampaignId"));
		Select marCam = new Select(element4);
		marCam.selectByIndex(6);
		
		//select state
		WebElement element5 = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select state = new Select(element5);
		state.selectByValue("TX");
		
		//click on create account tab
		driver.findElement(By.className("smallSubmit")).click();
		
		boolean title = driver.findElement(By.className("tabletext")).isDisplayed();
		System.out.println(title);
		
		//Closing the browser
		driver.close();
		

	}

}
