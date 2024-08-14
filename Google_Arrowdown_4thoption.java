package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Arrowdown_4thoption 
{
public static void main(String[] args) 
{
	 ChromeDriver driver= new ChromeDriver();
     driver.get("https://www.google.com/");
     driver.manage().window().maximize();
     WebElement e1=driver.findElement(By.name("q"));
     e1.sendKeys("India");
     e1.sendKeys(Keys.ARROW_DOWN);
	
	
	
	
	
	}

}
