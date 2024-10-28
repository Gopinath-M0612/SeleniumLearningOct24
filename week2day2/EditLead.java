package learning.week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		
		//launching browser
		ChromeDriver driver = new ChromeDriver();
		
		//Passing URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Maximizing the window
		driver.manage().window().maximize();
		
		//Passing the user name
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		//Passing password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Clicking on login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click on the CRM/SFA Link
		driver.findElement(By.id("label")).click();
		
		//Click on the Leads Button
		driver.findElement(By.linkText("Leads")).click();
		
		//Click on Create Lead
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter the CompanyName Field Using Xpath
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Amazon");
		
		//Enter the FirstName Field Using Xpath
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Gopi");
		
		//Enter the LastName Field Using Xpath
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("M");
		
		//Enter the FirstName (Local) Field Using Xpath
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Kandan");
		
		//Enter the Department Field Using any Locator of Your Choice
		driver.findElement(By.name("departmentName")).sendKeys("Electrical");
		
		//Enter the Description Field Using any Locator of your choice
		driver.findElement(By.name("description")).sendKeys("Entering the description");
		
		//Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abcd@gmail.com");

		//Select State/Province as NewYork Using Visible Text
		WebElement element = driver.findElement(By.xpath("//select[contains(@id,'eGeoId')]"));
		Select click = new Select(element);
		click.selectByVisibleText("New York");
		
		//Click on the Create Button
		driver.findElement(By.name("submitButton")).click();
		
		//Click on the edit button
		driver.findElement(By.linkText("Edit")).click();
		
		//Clear the Description Field
		driver.findElement(By.id("updateLeadForm_description")).clear();
		
		//Fill the Important Note Field with Any text
		driver.findElement(By.id("updateLeadForm_description")).sendKeys("Important note");
		
		//Click on the update button
		driver.findElement(By.name("submitButton")).click();
		
		//Getting page title
		String pageTitle = driver.getTitle();
		System.out.println("Title of the page is: "+pageTitle);
		
		//Closing the window
		driver.close();
	
	}

}
