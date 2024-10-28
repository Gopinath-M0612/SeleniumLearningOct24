package learning.week2day2;

import java.awt.Dimension;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundButtonInteraction {

	public static void main(String[] args) throws InterruptedException {
	
		ChromeDriver driver = new ChromeDriver();
		
		//Passing URl
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Maximizing the window
		driver.manage().window().maximize();
		
		//Click on the button with the text ‘Click and Confirm title
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		
		
		//Verify that the title of the page is dashboard
		String title = driver.getTitle();
		System.out.println("Title of the page is "+title);
		
		Thread.sleep(2000);
		driver.navigate().back();
		
		//Check if the button with the text ‘Confirm if the button is disabled’ is disabled
		boolean display = driver.findElement(By.xpath("//span[text()='Disabled']")).isDisplayed();
		System.out.println(display);
		
		//Find and print the position of the button with the text ‘Submit
		Point  element = driver.findElement(By.id("j_idt88:j_idt94")).getLocation();
		System.out.println("The location of the submit button is "+element);
		
		//Find and print the background color of the button with the text ‘Find the Save button color
		WebElement element2 = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt96']"));
		String color = element2.getCssValue("background-color");
		System.out.println("Button colour is "+color); 
		
		//Find and print the height and width of the button with the text ‘Find the height and width of this button
		WebElement heWi = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt98']"));
		org.openqa.selenium.Dimension eL = heWi.getSize();
		System.out.println("The height and width of the button is :"+eL);
		
		//Closing the browser
		driver.close();
	
		
	}

}
