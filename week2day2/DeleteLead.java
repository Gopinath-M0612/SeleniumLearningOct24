package learning.week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
	
		//launch browser
		ChromeDriver driver = new ChromeDriver();
		
		//passing URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//maximizing the window
		driver.manage().window().maximize();
		
		//passing user name to input field using following sibling
		driver.findElement(By.xpath("//*[@for='username']/following-sibling::input")).sendKeys("demosalesmanager");
		
		//passing user name to input field using following sibling
		driver.findElement(By.xpath("//*[@for='password']/following-sibling::input")).sendKeys("crmsfa");
		
		//clicking on login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//clicking on CRM/SFA link
		driver.findElement(By.id("label")).click();
		
		//Clicking on leads link
		driver.findElement(By.linkText("Leads")).click();
		
		//Clicking on find lead link
		driver.findElement(By.linkText("Find Leads")).click();
		
		//Capturing the id of first resulting lead
		WebElement element = driver.findElement(By.linkText("10171"));
		String id = element.getText();
		System.out.println(id);
		
		element.click();
		
		//clicking on delete button
		driver.findElement(By.linkText("Delete")).click();
		
		//Clicking on find lead link
		driver.findElement(By.linkText("Find Leads")).click();
		
		//Passing the captured id
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(id);
		
		//Clicking on find lead button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		
		WebElement element2 = driver.findElement(By.xpath("//*[text()='No records to display']"));
		String rec = element2.getText();
		System.out.println(rec);
		
		if(rec.equals("No records to display"))
		  {
			System.out.println("The deletion is successful");
		  } 
		else
			System.out.println("info is not deleted");
		
		//Closing the window
		driver.close();
		                      
		
		
		
		
		

		
		
			
				
	/*			ChromeDriver driver=new ChromeDriver();
				driver.get("http://leaftaps.com/opentaps/control/main");
				driver.manage().window().maximize();
				
				//Login 
				driver.findElement(By.id("username")).sendKeys("demosalesmanager");
				
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				
				driver.findElement(By.className("decorativeSubmit")).click();
				
				driver.findElement(By.partialLinkText("CRM/SFA")).click();
				
				//goto leads tab
				driver.findElement(By.linkText("Leads")).click();
				
				driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
				Thread.sleep(10000);
			
				//Capture the lead ID of the first resulting lead
				WebElement leadIdElement = driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//div/a)[1]"));
				String leadIdValue = leadIdElement.getText();
				System.out.println(leadIdValue);
			
				//Click the first resulting lead.
				//- Click the "Delete" button.
				leadIdElement.click();
				Thread.sleep(2000);
				driver.findElement(By.className("subMenuButtonDangerous")).click();
				Thread.sleep(2000);
				//Verify the presence of the message "No records to display" in the Lead List. This 
				//message confirms the successful deletion
				driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
				driver.findElement(By.name("id")).sendKeys(leadIdValue);
				
				driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
				String actualValue=driver.findElement(By.className("x-paging-info")).getText();
				if(actualValue.contains("No records to display"))
					System.out.println("No records found message is  verified");
				else
					System.out.println("Record verification is failed");
				
				driver.close(); */
			}

		
}




