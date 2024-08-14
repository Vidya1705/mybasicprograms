package Assertions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class A_199_Flipkart_Sortbyoption 
{
@Test
public void Method1() throws InterruptedException
{
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.flipkart.com");
	driver.manage().window().maximize();
	WebElement fashion=driver.findElement(By.linkText("Fashion"));
	fashion.click();
	Thread.sleep(2000);
	WebElement Men=driver.findElement(By.xpath("//span[.='Men']"));
	Actions a1= new Actions(driver);
	a1.moveToElement(Men).perform();
	Thread.sleep(2000);
	WebElement tshirts=driver.findElement(By.xpath("//a[.='T-Shirts']"));
	tshirts.click();
	Thread.sleep(2000);
	WebElement hightolow=driver.findElement(By.linkText("Price -- High to Low"));
	hightolow.click();
	String currenturl= driver.getCurrentUrl();
	System.out.println(currenturl);
	Assert.assertEquals(currenturl.contains("sort=price_asc"),true,"sorry");	
	//"T-Shirts&sort=price_desc"
	//WebElement hightolow=driver.findElement(By.xpath("//div[@class='zg-M3Z'][2]"));
	
	
}
}
