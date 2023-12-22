package Selenium123;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
	/*	driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//textarea)[1]")).sendKeys("India"); // relative xpath
		driver.close(); 
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("Shoe"); // relative Xpath */

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("swati@gmail.com"); // relative Xpath
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("Timepass");
		driver.findElement(By.xpath("//button")).click();
	}

}
