package Selenium123;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class css 
{
	@Test
	public void csslocator()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		// type 1: of CSS selector - tag#id
		driver.findElement(By.cssSelector("input#email")).sendKeys("swati123");

	
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		//type 2: tagname.classname
		driver.findElement(By.cssSelector("textarea.gLFyf")).sendKeys("India");
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//type 3: tagname[AN=AV]
		driver.findElement(By.cssSelector("input[name=pass]")).sendKeys("secret");
		
		
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		//type 4: tagname.classname[AN=AV]
		driver.findElement(By.cssSelector("textarea.gLFyf[id=APjFqb]")).sendKeys("amravati");		
	}
}
