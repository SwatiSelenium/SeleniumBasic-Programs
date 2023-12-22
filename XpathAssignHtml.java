package Selenium123;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAssignHtml {

	public static void main(String[] args) 
	{
	ChromeDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/DELL/Downloads/learningHTML1%20(1).html");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("(/html/body/input)[1]")).sendKeys("Krishu"); // uname Xpath
	driver.findElement(By.xpath("(/html/body/input)[2]")).sendKeys("baby"); // hint textbox
	driver.findElement(By.xpath("(/html/body/input)[3]")).sendKeys("Abcxyz"); // password 
	driver.findElement(By.xpath("(/html/body/form/input)[1]")).sendKeys("Kri"); // fname 
//	driver.findElement(By.xpath("(/html/body/form/input)[2]")).sendKeys("kalamkar"); // lname is diabaled 
// 	driver.findElement(By.xpath("(html/body/form/input)[3]")).click();  // submit button not working
	driver.findElement(By.xpath("(((html/body/form)[2])/input)[1]")).click(); /// selecting boy checkbox
	driver.findElement(By.xpath("(((html/body/form)[2])/input)[2]")).click();/// selecting girl checkbox  
	driver.findElement(By.xpath("(((html/body/form)[2])/input)[3]")).click();/// selecting baby checkbox
	// not able to write absolute xpath for radio button - Ask in kt
	
	driver.findElement(By.xpath("(/html/body/select/option)[3]")).click();
	
	
	}

}
