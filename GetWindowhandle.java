package Selenium123;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowhandle {

	public static void main(String[] args) 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.getWindowHandle();
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());
		driver.close();
	}

}
