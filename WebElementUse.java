package Selenium123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementUse {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//return type of find element is WebElement
		WebElement firstname =driver.findElement(By.xpath("//input[@name='email']"));
		firstname.sendKeys("swati@gmail.com");

	}

}
