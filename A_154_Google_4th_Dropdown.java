package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_154_Google_4th_Dropdown 
{
public static void main(String[] args) 
{

    ChromeDriver driver= new ChromeDriver();
    driver.get("https://www.google.com");
    driver.manage().window().maximize();
    WebElement e1= driver.findElement(By.name("q"));
    e1.sendKeys("Cricket");
    e1.sendKeys(Keys.ARROW_DOWN);
    e1.sendKeys(Keys.ARROW_DOWN);
    e1.sendKeys(Keys.ARROW_DOWN);
    e1.sendKeys(Keys.ENTER);
	
	
	}

}
