package Selenium123;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser 
{
	public static void main(String[] args) 
	{
		ChromeDriver d1 = new ChromeDriver(); // empty browser
		d1.get("https://www.youtube.com/"); // Navigate to website
		String title1 = d1.getTitle();
		System.out.println(title1);
		d1.getWindowHandle();
		System.out.println(d1.getWindowHandle()); // gives browserid of parent or window which has control
		System.out.println(d1.getWindowHandles());  // gives browser id of parent and child window
		d1.close();
		
		
		FirefoxDriver Driver = new FirefoxDriver();
		Driver.get("https://www.facebook.com/");
		String title =Driver.getTitle(); // getting title of project and storing it in "title"
		System.out.println(title); // printing title
		Driver.quit();
		
	}

}
