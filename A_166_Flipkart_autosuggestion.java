package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_166_Flipkart_autosuggestion 
{
public static void main(String[] args) 
{
	ChromeDriver driver= new ChromeDriver();
    driver.get("https://www.flipkart.com");
    driver.manage().window().maximize();
    WebElement auto= driver.findElement(By.name("q"));
    auto.sendKeys("Shoes");
    
	
	
	}

}
