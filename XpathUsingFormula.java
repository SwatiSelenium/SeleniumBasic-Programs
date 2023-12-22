package Selenium123;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingFormula {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
	/*	driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Shoe"); //Xpath path using formula
		
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("swati@gmail.com"); //Xpath path using formula
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Timepass");
		driver.findElement(By.xpath("//button[@value='1']")).click();
	*/	
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		
		// closingX is not working - ask in KT
		driver.findElement(By.xpath("span[.='✕']")).click();
		driver.findElement(By.xpath("//a[.='Bluetooth Headphones']")).click(); //Xpath path using formula
	}

}
