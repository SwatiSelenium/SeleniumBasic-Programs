package Selenium123;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagnameXpath {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("swati@gmail.com"); //Xpath path using formula
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Timepass");
		driver.findElement(By.tagName("button")).click();
//		driver.findElement(By.tagName("button")).click(); // line 16 is same as 15, why this is giving error, ask?)

	}

}
