package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A_145_Flipkart_Hoverover_login 
{
public static void main(String[] args) 
{
      ChromeDriver driver= new ChromeDriver();
      driver.get("https://www.flipkart.com/");
      driver.manage().window().maximize();
      WebElement e1=driver.findElement(By.xpath("//a[@class='_1TOQfO']"));
      Actions a= new Actions(driver);
      a.moveToElement(e1).perform();
      WebElement myprofile= driver.findElement(By.xpath("(//li)[1]"));
      Actions a1= new Actions(driver);
      a1.moveToElement(myprofile).perform();
      a1.click();
	
	
	
	
	}

}
