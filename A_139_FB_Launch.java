package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_139_FB_Launch 
{

	public static void main(String[] args)
	{
		ChromeDriver driver= new ChromeDriver();
	     driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement UN= driver.findElement(By.xpath("//input[@id='email']")); 
		UN.sendKeys("Vidya1985@gmail.com");
		WebElement PW= driver.findElement(By.xpath("//input[@name='pass']")); 
		PW.sendKeys("Vids@123");
		WebElement Login= driver.findElement(By.xpath("//button[@name='login']")); 
		Login.click();
		
		
	}

}
