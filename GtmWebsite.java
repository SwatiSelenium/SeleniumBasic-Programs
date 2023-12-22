package Selenium123;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GtmWebsite 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("your-name")).sendKeys("Username");
		driver.findElement(By.id("2")).sendKeys("Hint");
		driver.findElement(By.name("Password")).sendKeys("Password");
		driver.findElement(By.id("4")).sendKeys("FN-swati");
		driver.findElement(By.id("5")).sendKeys("LN-Kalamkar");
		driver.findElement(By.name("radio-45")).click();  // Radio button is not working here	
	//	driver.findElement(By.
		
	}

}
