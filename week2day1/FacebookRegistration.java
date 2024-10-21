package learning.week2day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) {
		
		//Launch  browser
		ChromeDriver driver = new ChromeDriver();
		
		//pass URL
		driver.get("https://en-gb.facebook.com/");
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Maximize browser
		driver.manage().window().maximize();
		
		//Click on create new account
		driver.findElement(By.linkText("Create new account")).click();
		
		//Enter first name
		driver.findElement(By.name("firstname")).sendKeys("Goki");
		
		//enter sure name
		driver.findElement(By.name("lastname")).sendKeys("lag");
		
		//Enter mobile number or email
		driver.findElement(By.name("reg_email__")).sendKeys("9922334445");
		
		//Enter password
		driver.findElement(By.id("password_step_input")).sendKeys("Abcd@12345.&");
		
		//Select day
		WebElement element = driver.findElement(By.id("day"));
		Select day = new Select(element);
		day.selectByIndex(10);
		
		//Select month
		WebElement element2 = driver.findElement(By.id("month"));
		Select month = new Select(element2);
		day.selectByValue("3");
		
		//Select year
		WebElement element3 = driver.findElement(By.id("year"));
		Select year = new Select(element3);
		year.selectByVisibleText("2002");
		
		
		
		
		
		

	}

}
