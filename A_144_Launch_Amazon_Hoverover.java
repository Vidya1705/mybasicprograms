package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A_144_Launch_Amazon_Hoverover
{
public static void main(String[] args) 
{
	 ChromeDriver driver= new ChromeDriver();
     driver.get("https://www.grotechminds.com/payments/");
     driver.manage().window().maximize();
     WebElement accountandlis=driver.findElement(By.xpath("//span[.='Hello,sign in']"));
     Actions a1= new Actions(driver);
     a1.moveToElement(accountandlis).perform();
     
	
	
	
	
	
	
	
	}

}
