package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_130_Launchgoogle_searchIndia 
{
public static void main(String[] args) 
{
    ChromeDriver driver= new ChromeDriver();
    driver.get("https://www.google.com");
    driver.manage().window().maximize();
    driver.findElement(By.name("q")).sendKeys("India");
    //driver.findElement(By.name("q")).click();
    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    
	
	
	
	
	
	}

}
