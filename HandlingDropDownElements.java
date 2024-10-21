package learning.week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDownElements {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		//opening URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//maximizing the window
		driver.manage().window().maximize();
		
		//passing user name
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		//passing password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//clicking on login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//click on crm/sfa link
		driver.findElement(By.id("label")).click();
		
		//click on leads tab
		driver.findElement(By.className("x-panel-header")).click();
		
		//click on create lead 
		driver.findElement(By.linkText("Create Lead")).click();
		Thread.sleep(30);
		//entering company name on company name fiels
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
		Thread.sleep(30);
		
		//entering first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("test");
		
		//entering last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("leaf");
		
		//select employee in dd
		WebElement element = driver.findElement(By.id("createLeadForm_dataSourceId"));
		//importing select class
		Select source = new Select(element);
		source.selectByIndex(4);	
		
		//select automobiles in marketing campaign
		WebElement element2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select source2 = new Select(element2);
		source2.selectByVisibleText("Automobile");
		
		//select corporation in ownership
		WebElement element3 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select source3 = new Select(element3);
		source3.selectByValue("OWN_SCORP");
		
		//click on create lead button
		driver.findElement(By.name("submitButton")).click();
		
		//get page title
		System.out.println("Title of the current page is - "+driver.getTitle());
		
		//closing current window
		driver.close();
	}

}
