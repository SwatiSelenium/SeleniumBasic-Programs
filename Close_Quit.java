package Selenium123;

import org.openqa.selenium.chrome.ChromeDriver;

public class Close_Quit {

	public static void main(String[] args) 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.linkedin.com/");
		driver.close();
		
		driver.get("https://www.facebook.com");
		driver.quit();

	}

}
