package Selenium123;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Downloads/learningHTML1%20(1).html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(/html/body/input)[2]")).sendKeys("hello"); // hint textbox
		driver.findElement(By.xpath("((/html/body/form)[2]/input)[2]")).click(); // selecting i am girl checkbox
	}

}
