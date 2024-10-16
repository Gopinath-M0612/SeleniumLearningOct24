package week1.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class toPrintOddNumbers {

	public static void main(String[] args) {
		
	/*	for(int i = 1; i <= 10; i++)
		{
			if(i%2 != 0)
			{
				System.out.println(i+"is odd number");
			}
		}*/
		
		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		WebElement oU = w.until(ExpectedConditions.v)
		
		WebElement tX = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='path'][@id='ytp-id-48'])[1]")));
		tX.click();
		

	}

}
