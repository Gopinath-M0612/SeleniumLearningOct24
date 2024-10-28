package learning.week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		

		
		
		//Launching the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Passing URL
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Maximizing the window
		driver.manage().window().maximize();
		
		//Selecting favourite browser
		driver.findElement(By.xpath("//label[text()='Chrome']")).click();
		
		driver.findElement(By.xpath("//label[text()='Chennai']")).click();
		driver.findElement(By.xpath("//label[text()='Chennai']")).click();

		boolean status = driver.findElement(By.xpath("//label[text()='Chennai']")).isSelected();
		System.out.println(status);
		
		boolean status2 = driver.findElement(By.xpath("//input[@id='j_idt87:console2:3']")).isEnabled();
		System.out.println(status2);
		
		boolean status3 = driver.findElement(By.xpath("//input[@id='j_idt87:age:1']")).isEnabled();
		System.out.println(status3);
		
		driver.close();
		}
	
	}


