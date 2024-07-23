package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_142_143_Amazon_shoes_Enter
{
public static void main(String[] args) 
{

	ChromeDriver driver= new ChromeDriver();
    driver.get("https://www.amazon.in");
    driver.manage().window().maximize();
    WebElement e1= driver.findElement(By.xpath("(//input)[5]"));
    e1.sendKeys("shoes");
    //e1.sendKeys(Keys.ENTER);
    WebElement e2= driver.findElement(By.xpath("(//input)[6]"));
    e1.click();
    
	
	
	
	
	}

}
